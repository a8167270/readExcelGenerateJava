from JavaClassFile import *


class JavaServerRequestClass(JavaClass):
    def __init__(self, data):
        ClassFile.__init__(self, data)

    # 创建类
    def createClass(self):
        return 'package com.zte.node.request;\n\n' \
               'import com.fasterxml.jackson.annotation.JsonIgnoreProperties;\n' \
               'import com.zte.node.basebean.RequestBase;' + createComment(self.Class.name + '.java',
                                                                           self.Class.classComment) + 'public class ' \
               + self.Class.name + ' extends RequestBase{\n\n' \
               + self.createProperty() + '\n' + self.createGetterSetter() + self.createCheckMethod() + '\n}'

        # 创建属性

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

    def createCheckMethod(self):
        s = 'public boolean checkValidRequestInfo() {\n' \
            ' return '

        for propertys in self.Class.propertyList:
            if propertys.isMust == '是':
                s += '!Tools.isNullorEmpty({0}) &&\n'.format(propertys.name)

        s = s[:-3] + ';\n}\n'

        return s
