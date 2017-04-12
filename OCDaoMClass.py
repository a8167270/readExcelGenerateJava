from Property import Property


class OCDaoMClass(object):
    def __init__(self, name, dataList, modelList):
        self.name = name
        self.dataList = dataList
        self.modelList = modelList

    def createClass(self):
        s = '#import "{0}.h"\n' \
            '#import "NetWorkManager.h"\n' \
            '#import "MJExtension.h"\n\n' \
            '@implementation {0} \n\n' \
            .format(self.name)

        s += self.createMethod() + '@end'

        return s

    def createMethod(self):
        s = ''
        if len(self.dataList) <= 0:
            return s
        for data in self.dataList:
            # if data[2].name.find('Model') < 0:
            #     if data[2].name.find('Dic') < 0:
            #         s += self.createNullMethod(data)
            #     else:
            #         s += self.createGetMethod(data)
            # else:
            if data.response.name.find('(void)') > -1:
                s += self.createNullMethod(data)
            else:
                s += self.createModelMethod(data)
        return s

    def createModelMethod(self, data):
        methodName = data.url[data.url.find('/') + 1:]
        s = '//{3}' \
            '\n+ (void){4}:({2} *)requestModel AndSuc:(onSuccessful)suc\n' \
            '{{\n' \
            '   __block {0} *model;\n' \
            '    [[NetWorkManager shareManager] postDataSourceFromURL:@"{1}" Dic:[requestModel.mj_keyValues copy] Success:^(' \
            'NSDictionary *success){{\n'.format(data.response.name, data.url, data.request.name,
                                              data.comment, methodName)

        # '       if([[success objectForKey:@"RESULT"] intValue] != 10000)\n' \
        # '       {{\n' \
        # '             suc(model);\n' \
        # '             return;\n' \
        # '       }}\n\n'.format(data[2].name, data[0], data[1].name, data[1].classComment)

        for propertys in data.response.propertyList:
            if not isinstance(propertys, Property):
                continue

            if propertys.type.find('List') > -1 and propertys.type.find('Model') > -1:
                s += self.createMapMethod(data.response.name, propertys)

        s += '       model = [{0} mj_objectWithKeyValues:success];\n' \
             '       suc(model);\n' \
             '   }} AndFail:^(NSError *fail){{\n' \
             '       suc(fail);\n' \
             '   }}];\n' \
             '}}\n\n'.format(data.response.name, data.url, data.request.name)

        return s

    def createMapMethod(self, modelName, propertys):
        name = propertys.type[propertys.type.find('<') + 1:propertys.type.find('>')]

        s = ''
        for model in self.modelList:
            if model.name == name:
                for newProperty in model.propertyList:
                    if newProperty.type.find('List') > -1 and newProperty.type.find('Model') > -1:
                        s += self.createMapMethod(name, newProperty)

                s += '      [{0} mj_setupObjectClassInArray:^NSDictionary *{{\n' \
                     '            return @{{@"{1}":@"{2}"}};\n' \
                     '       }}];\n\n'.format(modelName, propertys.name,
                                              propertys.type[
                                              propertys.type.find('<') + 1: propertys.type.find('>')])
        return s

    def createNullMethod(self, data):
        responseName = data.response.name[:data.response.name.find('(')]
        methodName = data.url[data.url.find('/') + 1:]
        s = '//{2}' \
            '\n+ (void){4}:({3} *)requestModel AndSuc:(onSuccessful)suc\n' \
            '{{\n' \
            '   [[NetWorkManager shareManager] postDataSourceFromURL:@"{1}" Dic:[requestModel.mj_keyValues copy] ' \
            'Success:^(NSDictionary *success){{\n' \
            '       //若无错误码，表示成功\n' \
            '   }} AndFail:^(NSError *fail){{\n' \
            '       suc(fail);\n' \
            '   }}];\n' \
            '}}\n\n'.format(responseName, data.url, data.comment, data.request.name, methodName)

        return s
