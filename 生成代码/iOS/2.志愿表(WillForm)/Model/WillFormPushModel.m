//
// WillFormPushModel.m
//志愿表推送信息
//
//
#import "WillFormPushModel.h"
@implementation WillFormPushModel 

- (NSString *)getMessage
{
    if(_message== nil)
    {
        return @"";
    }

    return _message;
}

@end