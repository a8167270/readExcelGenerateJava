//
// ChanceNumModel.h
//冲、稳、保院校数量
//
//
#import <Foundation/Foundation.h>
@interface ChanceNumModel : NSObject 

@property (nonatomic,assign)NSInteger riskCount;//“冲”院校数量
@property (nonatomic,assign)NSInteger stableCount;//“稳”院校数量
@property (nonatomic,assign)NSInteger safeCount;//“保”院校数量

@end