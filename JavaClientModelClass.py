
from JavaClassFile import *


class JavaMClientModelClass(ClassFile):
    _metaclass_ = type

    def __init__(self, data):
        ClassFile.__init__(self, data)

    # 创建类
    def createClass(self):
        return createComment(self.Class.name + '.java', self.Class.classComment) + 'public class ' \
               + self.Class.name + ' implements Serializable{\n\n' \
                                   'private static final long serialVersionUID = 1L;\n' \
               + self.createProperty() + '\n' + self.createGetterSetter() + '\n}'

    # 创建属性
    def createProperty(self):
        if len(self.Class.propertyList) <= 0:
            return

        s = ''
        for propertys in self.Class.propertyList:
            if not isinstance(propertys, Property):
                continue
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
            s += createCheckGetter(propertys) + createSetter(propertys)
        return s



