from OperatorFile import *
from JavaClassFile import JavaClass
from JavaServerRequestClass import JavaServerRequestClass
from OCHClassFile import OCClass
from OCDaoMClass import OCDaoMClass
from JavaInterfaceClass import JavaInterfaceClass
from JavaServiceModel import JavaServiceModel
from OCDaoHClass import OCDaoHClass
from JavaClientModelClass import JavaMClientModelClass
from OCMClass import OCMClass
from JavaServiceClass import JavaServiceClass
import os

thisPath = os.path.abspath('.')
javaClientPath = thisPath + '\\生成代码' + '\\javaClient\\'
javaServicePath = thisPath + '\\生成代码' + '\\javaService\\'
iOSPath = thisPath + '\\生成代码' + '\\iOS\\'


def createClass(data):
    interfaceName = data[0][data[0].find('(') + 1: data[0].find(')')] + 'Interface'

    excelData = data[1]

    # 创建javaClientInterface
    clientInterfacePath = javaClientPath + data[0] + '\\'
    iOSInterfacePath = iOSPath + data[0] + '\\'

    getInterfaceClass(clientInterfacePath, iOSInterfacePath, data, excelData, interfaceName)

    createModelClass(clientInterfacePath, iOSInterfacePath, excelData)

    for interfaceModel in excelData[1]:
        getRequestClass(clientInterfacePath, iOSInterfacePath, interfaceModel)

        getResponseClass(clientInterfacePath, iOSInterfacePath, interfaceModel)


def getRequestClass(clientInterfacePath, iOSInterfacePath, interfaceModel):
    # java client Request
    javaClientRequestModel = JavaClass(interfaceModel.request)
    writeFile(clientInterfacePath + 'Request\\', javaClientRequestModel.Class.name + '.java',
              javaClientRequestModel.createClass())
    print('JavaClientClass finished')

    ocHModelClass = OCClass(interfaceModel.request)
    writeFile(iOSInterfacePath + 'request' + '\\', ocHModelClass.Class.name + '.h', ocHModelClass.createClass())
    print('OCHClass Response finished')

    ocModelClass = OCMClass(interfaceModel.request)
    writeFile(iOSInterfacePath + 'request' + '\\', ocModelClass.Class.name + '.m', ocModelClass.createRequestClass())
    print('OCHClass Response finished')

    javaServiceRequest = JavaServerRequestClass(interfaceModel.request)
    writeFile(javaServicePath + 'request' + '\\', javaServiceRequest.Class.name + '.java',
              javaServiceRequest.createClass())
    print('JavaServiceClass Model finished')


def getResponseClass(clientInterfacePath, iOSInterfacePath, interfaceModel):
    if interfaceModel.response.name.find('void') > -1:
        return

    # Response
    # java client
    javaClientResponseModel = JavaMClientModelClass(interfaceModel.response)
    writeFile(clientInterfacePath + 'Response\\', javaClientResponseModel.Class.name + '.java',
              javaClientResponseModel.createClass())
    print('JavaClientClass finished')

    # iOS
    ocHModelClass = OCClass(interfaceModel.response)
    writeFile(iOSInterfacePath + 'response' + '\\', ocHModelClass.Class.name + '.h', ocHModelClass.createClass())
    print('OCHClass Response finished')

    ocModelClass = OCMClass(interfaceModel.response)
    writeFile(iOSInterfacePath + 'response' + '\\', ocModelClass.Class.name + '.m', ocModelClass.createClass())
    print('OCHClass Response finished')

    javaServiceModel = JavaServiceClass(interfaceModel.response)
    writeFile(javaServicePath + 'response' + '\\', javaServiceModel.Class.name + '.java',
              javaServiceModel.createClass())
    print('JavaServiceClass response finished')


# 创建访问接口
def getInterfaceClass(clientInterfacePath, iOSInterfacePath, data, excelData, interfaceName):
    interfaces = JavaInterfaceClass(interfaceName, excelData[1])
    writeFile(clientInterfacePath, interfaces.name + '.java', interfaces.createClass())
    print('JavaClientClass finished')

    # 创建iOS Dao
    daoName = data[0][data[0].find('(') + 1: data[0].find(')')] + 'Dao'
    ocDao = OCDaoHClass(daoName, excelData[1])
    writeFile(iOSInterfacePath + '\\Dao\\', daoName + '.h', ocDao.createClass())
    print('JavaClientClass finished')

    ocMDao = OCDaoMClass(daoName, excelData[1], excelData[0])
    writeFile(iOSInterfacePath + '\\Dao\\', daoName + '.m', ocMDao.createClass())
    print('JavaClientClass finished')


# 创建Model文件
def createModelClass(clientInterfacePath, iOSInterfacePath, excelData):

    if len(excelData[0]) > 0:
        for model in excelData[0]:
            javaClientModel = JavaMClientModelClass(model)
            writeFile(clientInterfacePath + 'Model\\', javaClientModel.Class.name + '.java',
                      javaClientModel.createClass())
            print('JavaClientClass finished')

            javaServiceModel = JavaServiceModel(model)
            writeFile(javaServicePath + 'Model' + '\\', javaServiceModel.Class.name + '.java',
                      javaServiceModel.createClass())
            print('JavaServiceClass Model finished')

            ocHModelClass = OCClass(model)
            writeFile(iOSInterfacePath + 'Model' + '\\', ocHModelClass.Class.name + '.h', ocHModelClass.createClass())
            print('OCHClass Response finished')

            ocModelClass = OCMClass(model)
            writeFile(iOSInterfacePath + 'Model' + '\\', ocModelClass.Class.name + '.m', ocModelClass.createClass())
            print('OCHClass Response finished')


if __name__ == '__main__':
    docPath = thisPath + '\\document\\'
    listFile = os.listdir(docPath)
    for file in listFile:
        if os.path.splitext(file)[1] == '.xlsm':
            fullPath = docPath + '\\' + file
            dataList = os.path.splitext(file)[0], readExcel(fullPath)
            createClass(dataList)
