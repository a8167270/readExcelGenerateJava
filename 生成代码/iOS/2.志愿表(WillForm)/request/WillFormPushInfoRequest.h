//
// WillFormPushInfoRequest.h
// 
//
//
#import <Foundation/Foundation.h>
#import "WillFormModel.h"
@interface WillFormPushInfoRequest : NSObject 

@property (nonatomic,assign)NSInteger uidForm;//推送人ID
@property (nonatomic,assign)NSInteger uidTo;//接收人Id
@property (nonatomic,assign)NSInteger willFormId;//志愿表ID
@property (nonatomic,strong)WillFormModel *willFormInfo;//志愿表信息
@property (nonatomic,strong)NSString *message;//留言

@end