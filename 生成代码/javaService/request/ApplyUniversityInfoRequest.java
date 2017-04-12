package com.zte.node.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zte.node.basebean.RequestBase;//
// ApplyUniversityInfoRequest.java
// 
//
//
public class ApplyUniversityInfoRequest extends RequestBase{

private ApplyInfoModel applyInfoModel;//学生报考信息
private Integer index;//获取院校索引
private Integer chanceType;//冲，稳，保类型（冲：1，稳：2，保：3）

public ApplyInfoModel getApplyInfoModel(){
   return this.applyInfoModel; 
}
public void setApplyInfoModel(ApplyInfoModel applyInfoModel){
   this.applyInfoModel = applyInfoModel; 
}
public Integer getIndex(){
   return this.index; 
}
public void setIndex(Integer index){
   this.index = index; 
}
public Integer getChanceType(){
   return this.chanceType; 
}
public void setChanceType(Integer chanceType){
   this.chanceType = chanceType; 
}
public boolean checkValidRequestInfo() {
 return !Tools.isNullorEmpty(applyInfoModel) &&
!Tools.isNullorEmpty(index) &&
!Tools.isNullorEmpty(chanceType) ;
}

}