
class OCDaoHClass(object):
    def __init__(self, name, dataList):
        self.name = name
        self.dataList = dataList

    def createClass(self):
        s = self.createHeader() + self.createMethod() + '@end'
        return s

    def createMethod(self):
        s = ''
        if len(self.dataList) <= 0:
            return s
        for data in self.dataList:
            methodName = data.url[data.url.find('/') + 1:]
            if data.response.name.find('(void)') > -1:
                s += '//{2}\n+ (void){0}:({1} *)model AndSuc:(onSuccessful)suc;\n\n'.format(
                    methodName, data.request.name, data.comment)
            else:
                s += '//{2}\n+ (void){0}:({1} *)model AndSuc:(onSuccessful)suc;\n\n'.format(
                    methodName, data.request.name, data.comment)

        return s

    def createHeader(self):
        s = '#import <Foundation/Foundation.h>\n'

        modelSet = set()
        for data in self.dataList:
            if data.request.name.find('Request') > -1:
                modelSet.add(data.request.name)
            if data.response.name.find('Response') > -1:
                modelSet.add(data.response.name)

        for key in modelSet:
            s += '#import "{}.h"\n'.format(key)

        s += '\ntypedef void(^onSuccessful)(id obj);\n\n' \
             '@interface {} : NSObject\n\n' \
            .format(self.name)

        return s
