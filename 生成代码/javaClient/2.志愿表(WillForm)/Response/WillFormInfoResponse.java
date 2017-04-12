//
// WillFormInfoResponse.java
// 
//
//
public class WillFormInfoResponse implements Serializable{

private static final long serialVersionUID = 1L;
private WillFormModel willFormInfo;//志愿表

public WillFormModel getWillFormInfo(){
   return this.willFormInfo; 
}
public void setWillFormInfo(WillFormModel willFormInfo){
   this.willFormInfo = willFormInfo; 
}

}