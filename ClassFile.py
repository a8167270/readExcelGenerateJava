import abc
from Property import Classes


# 注释
def createComment(name, classComment):
    return '//\n' \
           '// {0}\n' \
           '//{1}\n' \
           '//\n' \
           '//\n'.format(name, classComment)


class ClassFile(object):
    __metaclass__ = abc.ABCMeta

    def __init__(self, classData):
        if not isinstance(classData, Classes):
            return
        self.Class = classData

    def createClass(self):
        return

    def createProperty(self):
        return

    def createMethod(self):
        return

