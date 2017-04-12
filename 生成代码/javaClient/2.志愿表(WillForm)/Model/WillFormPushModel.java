//
// WillFormPushModel.java
//志愿表推送信息
//
//
public class WillFormPushModel implements Serializable{

private static final long serialVersionUID = 1L;
private int uidForm;//推送人ID
private int uidTo;//接收人Id
private List<WillFormModifyModel> modifyRecordList;//志愿表修改信息
private String status;//状态（是否可以操作，可以操作:available,不可以操作:unavailable）
private String date;//时间(yy-MM-dd hh:mm:ss)
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
public List<WillFormModifyModel> getModifyRecordList(){
   return this.modifyRecordList; 
}
public void setModifyRecordList(List<WillFormModifyModel> modifyRecordList){
   this.modifyRecordList = modifyRecordList; 
}
public String getStatus(){
    return this.status == null? "":status;
}
public void setStatus(String status){
   this.status = status; 
}
public String getDate(){
    return this.date == null? "":date;
}
public void setDate(String date){
   this.date = date; 
}
public String getMessage(){
    return this.message == null? "":message;
}
public void setMessage(String message){
   this.message = message; 
}

}