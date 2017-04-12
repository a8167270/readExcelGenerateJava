import xlrd
import codecs
import os

from Property import InterfaceClass
from JavaClassFile import *


def readProperty(rowNum, table):
    name = table.cell_value(rowNum, 0)
    types = table.cell_value(rowNum, 1)
    comment = table.cell_value(rowNum, 2)
    isMust = table.cell_value(rowNum, 3)
    propertys = Property((name, types, comment, isMust))
    return propertys


def readModel(table):
    modelList = []

    for rowNum in range(0, table.nrows):
        if table.cell_value(rowNum, 0) == 'Model':
            modelName = table.cell_value(rowNum + 1, 1)
            modelComment = table.cell_value(rowNum + 1, 0)

            propertyList = []
            rowNum += 3
            while table.cell_value(rowNum, 0) != 'ModelEnd':
                propertys = readProperty(rowNum, table)
                propertyList.append(propertys)
                rowNum += 1

            newModel = Classes(modelName, modelComment, propertyList)
            modelList.append(newModel)

    return modelList


def readInterface(table):
    url = ''
    interfaceName = ''
    requestProperty = []
    responseProperty = []
    requestName = ''
    responseName = ''

    rowNum = 0
    while rowNum < table.nrows:
        if table.cell_value(rowNum, 0) == '接口说明':
            interfaceName = table.cell_value(rowNum + 1, 0)
            url = table.cell_value(rowNum + 2, 1)
            rowNum += 3

        if table.cell_value(rowNum, 0) == '请求':
            requestName = table.cell_value(rowNum + 1, 0)
            rowNum += 3
            while table.cell_value(rowNum, 0) != '请求end':
                propertys = readProperty(rowNum, table)
                requestProperty.append(propertys)
                rowNum += 1

        if table.cell_value(rowNum, 0) == '响应':
            responseName = table.cell_value(rowNum + 1, 0)
            rowNum += 3
            while table.cell_value(rowNum, 0) != '响应end':
                propertys = readProperty(rowNum, table)
                responseProperty.append(propertys)
                rowNum += 1
        rowNum += 1

    requestClass = Classes(requestName, ' ', requestProperty)
    responseClass = Classes(responseName, ' ', responseProperty)

    return InterfaceClass(requestClass, responseClass, url, interfaceName)


def readExcel(name):
    wbData = xlrd.open_workbook(name)

    modelTable = wbData.sheet_by_name('相关Model')
    modelList = readModel(modelTable)

    interfaceList = []

    for number in range(2, wbData.nsheets):
        table = wbData.sheet_by_index(number)
        data = readInterface(table)
        interfaceList.append(data)

    return modelList, interfaceList


def writeFile(path, name, contentStr):
    if not os.path.exists(path):
        os.makedirs(path)

    f = codecs.open(path + name, 'w', encoding='utf8')
    f.write(contentStr)
    f.close()
