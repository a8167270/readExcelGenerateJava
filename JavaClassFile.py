from ClassFile import *
from Property import Property


# 获取检测Getter
def createCheckGetter(propertys):
    if not isinstance(propertys, Property):
        return

    nameStr = propertys.name[:1].upper() + propertys.name[1:]
    if propertys.type == 'String':
        return 'public {0} get{1}(){{\n' \
               '    return this.{2} == null? "":{2};\n' \
               '}}\n'.format(propertys.type, nameStr, propertys.name)
    else:
        return 'public {} get{}(){{\n   return this.{}; \n}}\n'.format(propertys.type, nameStr, propertys.name)


def createCheckSetter(propertys):
    if not isinstance(propertys, Property):
        return

    nameStr = propertys.name[:1].upper() + propertys.name[1:]
    if propertys.isMust == '是' and propertys.type == 'String':
        return 'public void set{0}({1} {2}){{\n' \
               '    if({2} == null){{\n' \
               '        this.{2} = {3};\n' \
               '    }}else{{\n' \
               '        this.{2} = {2};\n' \
               '    }}\n' \
               '}}\n' \
            .format(nameStr, propertys.type, propertys.name, '""')
    else:
        return 'public void set{0}({1} {2}){{\n   this.{2} = {2}; \n}}\n'.format(nameStr, propertys.type,
                                                                                 propertys.name)


# 获取Getter
def createGetter(propertys):
    if not isinstance(propertys, Property):
        return

    nameStr = propertys.name[:1].upper() + propertys.name[1:]
    return 'public {} get{}(){{\n   return this.{}; \n}}\n'.format(propertys.type, nameStr, propertys.name)


# 获取setter
def createSetter(propertys):
    if not isinstance(propertys, Property):
        return

    nameStr = propertys.name[:1].upper() + propertys.name[1:]
    return 'public void set{0}({1} {2}){{\n   this.{2} = {2}; \n}}\n'.format(nameStr, propertys.type, propertys.name)


class JavaClass(ClassFile):
    _metaclass_ = type

    def __init__(self, data):
        ClassFile.__init__(self, data)

    # 创建类
    def createClass(self):
        return createComment(self.Class.name + '.java', self.Class.classComment) + 'public class ' \
               + self.Class.name + '{\n\n' \
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
            s += createGetter(propertys) + createSetter(propertys)
        return s
