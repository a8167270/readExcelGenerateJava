//
// WillFormPushModel.java
//志愿表推送信息
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WillFormPushModel{

private Integer uidForm;//推送人ID
private Integer uidTo;//接收人Id
private List<WillFormModifyModel> modifyRecordList;//志愿表修改信息
private String status;//状态（是否可以操作，可以操作:available,不可以操作:unavailable）
private String date;//时间(yy-MM-dd hh:mm:ss)
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
public List<WillFormModifyModel> getModifyRecordList(){
   return this.modifyRecordList; 
}
public void setModifyRecordList(List<WillFormModifyModel> modifyRecordList){
   this.modifyRecordList = modifyRecordList; 
}
public String getStatus(){
   return this.status; 
}
public void setStatus(String status){
    if(status == null){
        this.status = "";
    }else{
        this.status = status;
    }
}
public String getDate(){
   return this.date; 
}
public void setDate(String date){
    if(date == null){
        this.date = "";
    }else{
        this.date = date;
    }
}
public String getMessage(){
   return this.message; 
}
public void setMessage(String message){
   this.message = message; 
}

}