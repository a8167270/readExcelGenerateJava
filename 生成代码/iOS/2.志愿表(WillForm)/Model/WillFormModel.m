//
// WillFormModel.m
//志愿表Model
//
//
#import "WillFormModel.h"
@implementation WillFormModel 

- (NSString *)getNotes
{
    if(_notes== nil)
    {
        return @"";
    }

    return _notes;
}

@end