package com.zte.node.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zte.node.basebean.RequestBase;//
// WillFormInfoRequest.java
// 
//
//
public class WillFormInfoRequest extends RequestBase{

private ApplyInfoModel applyInfo;//报考信息
private List<ApplyUniversityModel> universityList;//院校列表
private Integer userId;//用户ID

public ApplyInfoModel getApplyInfo(){
   return this.applyInfo; 
}
public void setApplyInfo(ApplyInfoModel applyInfo){
   this.applyInfo = applyInfo; 
}
public List<ApplyUniversityModel> getUniversityList(){
   return this.universityList; 
}
public void setUniversityList(List<ApplyUniversityModel> universityList){
   this.universityList = universityList; 
}
public Integer getUserId(){
   return this.userId; 
}
public void setUserId(Integer userId){
   this.userId = userId; 
}
public boolean checkValidRequestInfo() {
 return !Tools.isNullorEmpty(applyInfo) &&
!Tools.isNullorEmpty(universityList) &&
!Tools.isNullorEmpty(userId) ;
}

}