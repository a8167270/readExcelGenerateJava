//
// WillFormModel.h
//志愿表Model
//
//
#import <Foundation/Foundation.h>
#import "ApplyInfoModel.h"
#import "ApplyUniversityModel.h"
@interface WillFormModel : NSObject 

@property (nonatomic,assign)NSInteger willFormId;//志愿表ID
@property (nonatomic,strong)ApplyInfoModel *applyInfo;//报考信息
@property (nonatomic,strong)NSMutableArray *universityList;//院校列表
@property (nonatomic,strong)NSString *notes;//提示语

@end