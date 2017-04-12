package com.zte.node.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zte.node.basebean.RequestBase;//
// ApplyInfoRequest.java
// 
//
//
public class ApplyInfoRequest extends RequestBase{

private ApplyInfoModel applyInfo;//报考信息

public ApplyInfoModel getApplyInfo(){
   return this.applyInfo; 
}
public void setApplyInfo(ApplyInfoModel applyInfo){
   this.applyInfo = applyInfo; 
}
public boolean checkValidRequestInfo() {
 return !Tools.isNullorEmpty(applyInfo) ;
}

}