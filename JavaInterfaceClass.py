def createClientMethod(url, requestClass, responseClass, classComment):
    s = '    //{0}\n'.format(classComment)

    requestName = requestClass.name[:1].lower() + requestClass.name[1:]
    methodName = url[url.find('/') + 1:]
    if responseClass.name.find('void') > 0:
        s += '    public void {0}({1} {2}) throws Exception {{\n' \
             '        HttpInput input = new HttpInput(-1, UrlConstants.Url + "{3}");\n' \
             '        input.setData({2});\n' \
            .format(methodName, requestClass.name, requestName, url)
    else:
        s += '    public {0} {4}({1} {2}) throws Exception {{\n' \
             '        HttpInput input = new HttpInput(-1, UrlConstants.Url + "{3}");\n' \
             '        input.setData({2});\n' \
            .format(responseClass.name, requestClass.name, requestName, url, methodName)

    s += '\n' \
         '        HttpOutputPojo<{0}> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<{0}>>(){{}});\n' \
         '        return outputPojo.getData();' \
         '\n    }}\n\n'.format(responseClass.name)

    return s


class JavaInterfaceClass(object):
    def __init__(self, name, dataList):
        self.name = name
        self.dataList = dataList

    # 创建类
    def createClass(self):
        return 'public class ' \
               + self.name + ' extends BaseInterface {\n' \
               + self.createProperty() + self.createMethod() + '}\n'

    # 创建属性
    def createProperty(self):
        s = '    private static {0} {1};\n' \
            '    private {0}(){{\n' \
            '    }}\n' \
            '    static {{\n' \
            '         {1} = new {0}();\n' \
            '    }}\n' \
            '    public static {0} get{0}(){{\n' \
            '        return {1};\n' \
            '    }}\n'.format(self.name, self.name)

        return s

    def createMethod(self):
        s = ''
        if len(self.dataList) <= 0:
            return s
        for data in self.dataList:
            s += createClientMethod(data.url, data.request, data.response, data.comment)
        return s
