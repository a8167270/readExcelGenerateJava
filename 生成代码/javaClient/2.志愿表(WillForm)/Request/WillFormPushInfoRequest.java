//
// WillFormPushInfoRequest.java
// 
//
//
public class WillFormPushInfoRequest{

private int uidForm;//推送人ID
private int uidTo;//接收人Id
private int willFormId;//志愿表ID
private WillFormModel willFormInfo;//志愿表信息
private String message;//留言

public int getUidForm(){
   return this.uidForm; 
}
public void setUidForm(int uidForm){
   this.uidForm = uidForm; 
}
public int getUidTo(){
   return this.uidTo; 
}
public void setUidTo(int uidTo){
   this.uidTo = uidTo; 
}
public int getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(int willFormId){
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

}