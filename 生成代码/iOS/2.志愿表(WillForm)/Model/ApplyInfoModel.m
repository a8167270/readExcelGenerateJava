//
// ApplyInfoModel.m
//报考信息
//
//
#import "ApplyInfoModel.h"
@implementation ApplyInfoModel 

- (NSString *)getUniversityName
{
    if(_universityName== nil)
    {
        return @"";
    }

    return _universityName;
}

- (NSString *)getCity
{
    if(_city== nil)
    {
        return @"";
    }

    return _city;
}

- (NSString *)getMajorName
{
    if(_majorName== nil)
    {
        return @"";
    }

    return _majorName;
}

- (NSString *)getProvince
{
    if(_province== nil)
    {
        return @"";
    }

    return _province;
}

@end