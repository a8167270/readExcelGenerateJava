#import <Foundation/Foundation.h>
#import "UniversityListResponse.h"
#import "ApplyInfoRequest.h"
#import "ChanceNumResponse.h"
#import "ApplyUniversityInfoRequest.h"

typedef void(^onSuccessful)(id obj);

@interface InviteCodeDao : NSObject

//获取冲、稳、保院校数量
+ (void)getChanceNum:(ApplyInfoRequest *)model AndSuc:(onSuccessful)suc;

//根据筛选条件获取冲、稳、保院校
+ (void)getChanceUniversity:(ApplyUniversityInfoRequest *)model AndSuc:(onSuccessful)suc;

@end