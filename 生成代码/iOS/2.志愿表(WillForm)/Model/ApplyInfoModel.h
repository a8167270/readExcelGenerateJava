//
// ApplyInfoModel.h
//报考信息
//
//
#import <Foundation/Foundation.h>
@interface ApplyInfoModel : NSObject 

@property (nonatomic,strong)NSString *students;//生源地
@property (nonatomic,strong)NSString *enrollType;//批次
@property (nonatomic,strong)NSString *category;//科类
@property (nonatomic,assign)NSInteger score;//分数
@property (nonatomic,assign)NSInteger ranking;//排位
@property (nonatomic,strong)NSString *universityName;//目标院校
@property (nonatomic,strong)NSString *city;//目标城市
@property (nonatomic,strong)NSString *majorName;//目标专业
@property (nonatomic,strong)NSString *province;//省份

@end