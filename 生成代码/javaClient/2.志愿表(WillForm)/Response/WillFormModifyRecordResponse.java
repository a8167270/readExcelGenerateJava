//
// WillFormModifyRecordResponse.java
// 
//
//
public class WillFormModifyRecordResponse implements Serializable{

private static final long serialVersionUID = 1L;
private WillFormPushModel willFormPushInfo;//志愿表推送信息
private WillFormModel willFormInfo;//志愿表

public WillFormPushModel getWillFormPushInfo(){
   return this.willFormPushInfo; 
}
public void setWillFormPushInfo(WillFormPushModel willFormPushInfo){
   this.willFormPushInfo = willFormPushInfo; 
}
public WillFormModel getWillFormInfo(){
   return this.willFormInfo; 
}
public void setWillFormInfo(WillFormModel willFormInfo){
   this.willFormInfo = willFormInfo; 
}

}