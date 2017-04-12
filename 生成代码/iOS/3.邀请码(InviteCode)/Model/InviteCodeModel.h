//
// InviteCodeModel.h
//申请院校
//
//
#import <Foundation/Foundation.h>
#import "ApplyMajorModel.h"
@interface InviteCodeModel : NSObject 

@property (nonatomic,strong)NSString *universityCode;//院校代码
@property (nonatomic,strong)NSString *universityName;//院校名称
@property (nonatomic,assign)NSInteger chance;//录取概率
@property (nonatomic,strong)NSMutableArray *majorList;//专业列表

@end