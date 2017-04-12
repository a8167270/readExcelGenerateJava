from JavaClassFile import *

defaultValue = {'String': '""', 'Integer': -1, 'List<String>': '" "', 'int': 0}


class JavaServiceModel(JavaClass):
    def __init__(self, data):
        ClassFile.__init__(self, data)

        # 创建类

    def createClass(self):
        return createComment(self.Class.name + '.java', self.Class.classComment) \
               + 'package com.zte.node.entity;\n\n' \
                 'import com.fasterxml.jackson.annotation.JsonInclude;\n\n' \
                 '@JsonInclude(JsonInclude.Include.NON_NULL)\n' \
               + 'public class ' \
               + self.Class.name + '{\n\n' \
               + self.createProperty() + '\n' + self.createGetterSetter() + '\n}'

    def createProperty(self):
        if len(self.Class.propertyList) <= 0:
            return

        s = ''
        for propertys in self.Class.propertyList:
            if not isinstance(propertys, Property):
                continue
            if propertys.type == 'int':
                propertys.type = 'Integer'
            s += 'private {} {};//{}\n'.format(propertys.type, propertys.name, propertys.comment)

        return s

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




