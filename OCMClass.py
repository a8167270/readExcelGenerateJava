from ClassFile import *
from Property import *


class OCMClass(ClassFile):
    _metaclass_ = type

    def __init__(self, data):
        ClassFile.__init__(self, data)

    def createClass(self):
        s = createComment(self.Class.name + '.m', self.Class.classComment) + '#import "{0}.h"\n' \
                                                                             '@implementation {0} ' \
            .format(self.Class.name)

        s += '\n\n' + self.createGetMethod() + '@end'

        return s

    def createRequestClass(self):
        s = createComment(self.Class.name + '.m', self.Class.classComment) + '#import "{0}.h"\n' \
                                                                             '@implementation {0} ' \
            .format(self.Class.name)

        s += '\n\n' + '@end'

        return s

    def createModelClass(self):
        s = createComment(self.Class.name + '.m', self.Class.classComment) + '#import "{0}.h"\n\n' \
                                                                             '@implementation {0}' \
            .format(self.Class.name)

        s += '\n\n' + '@end'

        return s

    def createGetMethod(self):
        lists = filter(lambda x: isinstance(x, Property) and x.isMust == '否' and x.type == 'String',
                       self.Class.propertyList)
        s = ''
        for propertys in lists:
            nameStr = propertys.name[:1].upper() + propertys.name[1:]
            s += '- (NSString *)get{0}\n' \
                 '{{\n' \
                 '    if(_{1}== nil)\n' \
                 '    {{\n' \
                 '        return @"";\n' \
                 '    }}\n' \
                 '\n' \
                 '    return _{1};\n' \
                 '}}\n\n'.format(nameStr, propertys.name)

        return s
