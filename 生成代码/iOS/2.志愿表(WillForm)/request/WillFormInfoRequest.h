//
// WillFormInfoRequest.h
// 
//
//
#import <Foundation/Foundation.h>
#import "ApplyInfoModel.h"
#import "ApplyUniversityModel.h"
@interface WillFormInfoRequest : NSObject 

@property (nonatomic,strong)ApplyInfoModel *applyInfo;//报考信息
@property (nonatomic,strong)NSMutableArray *universityList;//院校列表
@property (nonatomic,assign)NSInteger userId;//用户ID

@end