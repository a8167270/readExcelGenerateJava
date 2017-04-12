//
// SaveWillFormResponse.java
// 
//
//
public class SaveWillFormResponse implements Serializable{

private static final long serialVersionUID = 1L;
private int willFormId;//志愿表ID

public int getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(int willFormId){
   this.willFormId = willFormId; 
}

}