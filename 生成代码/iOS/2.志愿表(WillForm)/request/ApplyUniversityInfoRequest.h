//
// ApplyUniversityInfoRequest.h
// 
//
//
#import <Foundation/Foundation.h>
#import "ApplyInfoModel.h"
@interface ApplyUniversityInfoRequest : NSObject 

@property (nonatomic,strong)ApplyInfoModel *applyInfoModel;//学生报考信息
@property (nonatomic,assign)NSInteger index;//获取院校索引
@property (nonatomic,assign)NSInteger chanceType;//冲，稳，保类型（冲：1，稳：2，保：3）

@end