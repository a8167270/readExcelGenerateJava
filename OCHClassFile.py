from ClassFile import *
from Property import *

typeDic = {"String": "(nonatomic,strong)NSString *",
           "Integer": "(nonatomic,assign)NSInteger ",
           "List<String>": "(nonatomic,strong)NSArray *",
           'int': '(nonatomic,assign)NSInteger ',
           "List": "(nonatomic,strong)NSMutableArray *"}


class OCClass(ClassFile):
    _metaclass_ = type

    def __init__(self, data):
        ClassFile.__init__(self, data)

    def createClass(self):
        return createComment(self.Class.name + '.h', self.Class.classComment) \
                   + '#import <Foundation/Foundation.h>\n' \
                   + self.createHeader() \
                   + '@interface {0} : NSObject \n\n'.format(self.Class.name) \
                   + self.createProperty() \
                   + '\n@end'

    def createProperty(self):
        if len(self.Class.propertyList) <= 0:
            return

        s = ''
        for propertys in self.Class.propertyList:
            if not isinstance(propertys, Property):
                continue

            if propertys.type in typeDic.keys():
                s += '@property {}{};//{}\n'.format(typeDic[propertys.type], propertys.name, propertys.comment)
            elif propertys.type.find('List') > -1:
                s += '@property {}{};//{}\n'.format(typeDic['List'], propertys.name, propertys.comment)
            elif propertys.type.find('Model') > -1:
                s += '@property (nonatomic,strong){} *{};//{}\n'.format(propertys.type, propertys.name, propertys.comment)

        return s

    def createHeader(self):
        if len(self.Class.propertyList) <= 0:
            return

        s = ''
        for propertys in self.Class.propertyList:
            if not isinstance(propertys, Property):
                continue

            if propertys.type.find('Model') > -1:
                headerStr = ''
                if propertys.type.find('<') > -1:
                    headerStr = propertys.type[propertys.type.find('<') + 1: propertys.type.find('>')]
                else:
                    headerStr = propertys.type
                s += '#import "{0}.h"\n'.format(headerStr)

        return s



