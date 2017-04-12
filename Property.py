# -*- coding: utf-8 -*-


class Property(object):
    _metaclass_ = type

    """
        属性类
    """
    def __init__(self, data):
        if not isinstance(data, tuple):
            return

        self.name = data[0]
        self.type = data[1]
        self.comment = data[2]
        self.isMust = data[3]


class Classes(object):
    _metaclass_ = type

    """
        类
    """
    def __init__(self, name, classComment, data):
        if not isinstance(data, list):
            return

        self.name = name
        self.classComment = classComment
        self.propertyList = data


class InterfaceClass(object):

    def __init__(self, request, response, url, comment):
        self.request = request
        self.response = response
        self.url = url
        self.comment = comment
