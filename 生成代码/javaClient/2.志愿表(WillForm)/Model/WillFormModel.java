//
// WillFormModel.java
//志愿表Model
//
//
public class WillFormModel implements Serializable{

private static final long serialVersionUID = 1L;
private int willFormId;//志愿表ID
private ApplyInfoModel applyInfo;//报考信息
private List<ApplyUniversityModel> universityList;//院校列表
private String notes;//提示语

public int getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(int willFormId){
   this.willFormId = willFormId; 
}
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
public String getNotes(){
    return this.notes == null? "":notes;
}
public void setNotes(String notes){
   this.notes = notes; 
}

}