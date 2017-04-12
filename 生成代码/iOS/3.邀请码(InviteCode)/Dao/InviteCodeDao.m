#import "InviteCodeDao.h"
#import "NetWorkManager.h"
#import "MJExtension.h"

@implementation InviteCodeDao 

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
       model = [UniversityListResponse mj_objectWithKeyValues:success];
       suc(model);
   } AndFail:^(NSError *fail){
       suc(fail);
   }];
}

@end