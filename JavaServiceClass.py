from JavaClassFile import *

defaultValue = {'String': '""', 'Integer': -1, 'List<String>': '" "', 'int': 0}


class JavaServiceClass(JavaClass):
    def __init__(self, data):
        ClassFile.__init__(self, data)

        # 创建类

    def createClass(self):
        return createComment(self.Class.name + '.java', self.Class.classComment) \
               + 'package com.zte.node.response;\n\n' \
                 'import com.fasterxml.jackson.annotation.JsonInclude;\n' \
                 'import com.zte.node.basebean.ResponseBase;\n\n' \
                 '@JsonInclude(JsonInclude.Include.NON_NULL)\n' \
               + 'public class ' \
               + self.Class.name + ' extends ResponseBase{\n\n' \
               + self.createProperty() + '\n' + self.createMethod() + self.createGetterSetter() + '\n}'

        # 创建setter getter
    def createGetterSetter(self):
        if len(self.Class.propertyList) <= 0:
            return

        s = ''
        for propertys in self.Class.propertyList:
            if not isinstance(propertys, Property):
                continue
            s += createGetter(propertys) + createCheckSetter(propertys)
        return s

    def createMethod(self):
        return '    public {0}(Integer RESULT,String EVENT){{\n' \
               '        super(RESULT,EVENT);\n' \
               '    }}\n'.format(self.Class.name)



