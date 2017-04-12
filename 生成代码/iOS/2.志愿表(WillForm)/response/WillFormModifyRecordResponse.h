//
// WillFormModifyRecordResponse.h
// 
//
//
#import <Foundation/Foundation.h>
#import "WillFormPushModel.h"
#import "WillFormModel.h"
@interface WillFormModifyRecordResponse : NSObject 

@property (nonatomic,strong)WillFormPushModel *willFormPushInfo;//志愿表推送信息
@property (nonatomic,strong)WillFormModel *willFormInfo;//志愿表

@end