package com.zte.node.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zte.node.basebean.RequestBase;//
// WillFormPushInfoRequest.java
// 
//
//
public class WillFormPushInfoRequest extends RequestBase{

private Integer uidForm;//推送人ID
private Integer uidTo;//接收人Id
private Integer willFormId;//志愿表ID
private WillFormModel willFormInfo;//志愿表信息
private String message;//留言

public Integer getUidForm(){
   return this.uidForm; 
}
public void setUidForm(Integer uidForm){
   this.uidForm = uidForm; 
}
public Integer getUidTo(){
   return this.uidTo; 
}
public void setUidTo(Integer uidTo){
   this.uidTo = uidTo; 
}
public Integer getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(Integer willFormId){
   this.willFormId = willFormId; 
}
public WillFormModel getWillFormInfo(){
   return this.willFormInfo; 
}
public void setWillFormInfo(WillFormModel willFormInfo){
   this.willFormInfo = willFormInfo; 
}
public String getMessage(){
   return this.message; 
}
public void setMessage(String message){
   this.message = message; 
}
public boolean checkValidRequestInfo() {
 return !Tools.isNullorEmpty(uidForm) &&
!Tools.isNullorEmpty(uidTo) ;
}

}