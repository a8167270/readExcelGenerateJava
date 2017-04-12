//
// WillFormPushModel.h
//志愿表推送信息
//
//
#import <Foundation/Foundation.h>
#import "WillFormModifyModel.h"
@interface WillFormPushModel : NSObject 

@property (nonatomic,assign)NSInteger uidForm;//推送人ID
@property (nonatomic,assign)NSInteger uidTo;//接收人Id
@property (nonatomic,strong)NSMutableArray *modifyRecordList;//志愿表修改信息
@property (nonatomic,strong)NSString *status;//状态（是否可以操作，可以操作:available,不可以操作:unavailable）
@property (nonatomic,strong)NSString *date;//时间(yy-MM-dd hh:mm:ss)
@property (nonatomic,strong)NSString *message;//留言

@end