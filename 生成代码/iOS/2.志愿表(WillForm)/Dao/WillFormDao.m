#import "WillFormDao.h"
#import "NetWorkManager.h"
#import "MJExtension.h"

@implementation WillFormDao 

//初始化志愿表
+ (void)initForm:(ApplyInfoRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block WillFormInfoResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/initForm" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       model = [WillFormInfoResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//获取冲、稳、保院校数量
+ (void)getChanceNum:(ApplyInfoRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block ChanceNumResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/getChanceNum" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       model = [ChanceNumResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//根据筛选条件获取冲、稳、保院校
+ (void)getChanceUniversity:(ApplyUniversityInfoRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block UniversityListResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/getChanceUniversity" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
      [ApplyUniversityModel mj_setupObjectClassInArray:^NSDictionary *{
            return @{@"majorList":@"ApplyMajorModel"};
       }];

      [UniversityListResponse mj_setupObjectClassInArray:^NSDictionary *{
            return @{@"universityList":@"ApplyUniversityModel"};
       }];

       model = [UniversityListResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//保存志愿表
+ (void)saveWillForm:(WillFormInfoRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block SaveWillFormResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/saveWillForm" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       model = [SaveWillFormResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//获取我的志愿表详情
+ (void)getWillFormInfo:(WillFormRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block WillFormInfoResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/getWillFormInfo" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       model = [WillFormInfoResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//推送志愿交流表：1、推送新志愿表，willFormId不能赋值。2、推送已有志愿表，willFormInfo不能赋值。3、推送修改志愿表，willFormId和willFormInfo都需要赋值。（必须严格遵守）
+ (void)pushWillForm:(WillFormPushInfoRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block SaveWillFormResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/pushWillForm" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       model = [SaveWillFormResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//获取推送志愿表详情
+ (void)getWillFormModifyRecord:(WillFormRequest *)requestModel AndSuc:(onSuccessful)suc
{
   __block WillFormModifyRecordResponse *model;
    [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/getWillFormModifyRecord" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       model = [WillFormModifyRecordResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

//查看志愿报告
+ (void)getWillFormReport:(WillFormInfoRequest *)requestModel AndSuc:(onSuccessful)suc
{
   [[NetWorkManager shareManager] postDataSourceFromURL:@"willform/getWillFormReport" Dic:[requestModel.mj_keyValues copy] Success:^(NSDictionary *success){
       //若无错误码，表示成功
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

@end