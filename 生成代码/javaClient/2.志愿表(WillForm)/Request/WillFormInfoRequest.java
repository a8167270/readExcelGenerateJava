//
// WillFormInfoRequest.java
// 
//
//
public class WillFormInfoRequest{

private ApplyInfoModel applyInfo;//报考信息
private List<ApplyUniversityModel> universityList;//院校列表
private int userId;//用户ID

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
public int getUserId(){
   return this.userId; 
}
public void setUserId(int userId){
   this.userId = userId; 
}

}