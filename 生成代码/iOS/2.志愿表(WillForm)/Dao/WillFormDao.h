#import <Foundation/Foundation.h>
#import "ApplyInfoRequest.h"
#import "WillFormRequest.h"
#import "UniversityListResponse.h"
#import "ChanceNumResponse.h"
#import "ApplyUniversityInfoRequest.h"
#import "WillFormInfoRequest.h"
#import "SaveWillFormResponse.h"
#import "WillFormPushInfoRequest.h"
#import "WillFormModifyRecordResponse.h"
#import "WillFormInfoResponse.h"

typedef void(^onSuccessful)(id obj);

@interface WillFormDao : NSObject

//初始化志愿表
+ (void)initForm:(ApplyInfoRequest *)model AndSuc:(onSuccessful)suc;

//获取冲、稳、保院校数量
+ (void)getChanceNum:(ApplyInfoRequest *)model AndSuc:(onSuccessful)suc;

//根据筛选条件获取冲、稳、保院校
+ (void)getChanceUniversity:(ApplyUniversityInfoRequest *)model AndSuc:(onSuccessful)suc;

//保存志愿表
+ (void)saveWillForm:(WillFormInfoRequest *)model AndSuc:(onSuccessful)suc;

//获取我的志愿表详情
+ (void)getWillFormInfo:(WillFormRequest *)model AndSuc:(onSuccessful)suc;

//推送志愿交流表：1、推送新志愿表，willFormId不能赋值。2、推送已有志愿表，willFormInfo不能赋值。3、推送修改志愿表，willFormId和willFormInfo都需要赋值。（必须严格遵守）
+ (void)pushWillForm:(WillFormPushInfoRequest *)model AndSuc:(onSuccessful)suc;

//获取推送志愿表详情
+ (void)getWillFormModifyRecord:(WillFormRequest *)model AndSuc:(onSuccessful)suc;

//查看志愿报告
+ (void)getWillFormReport:(WillFormInfoRequest *)model AndSuc:(onSuccessful)suc;

@end