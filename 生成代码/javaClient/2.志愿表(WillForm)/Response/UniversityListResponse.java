//
// UniversityListResponse.java
// 
//
//
public class UniversityListResponse implements Serializable{

private static final long serialVersionUID = 1L;
private List<ApplyUniversityModel> universityList;//“冲,稳，保”院校列表

public List<ApplyUniversityModel> getUniversityList(){
   return this.universityList; 
}
public void setUniversityList(List<ApplyUniversityModel> universityList){
   this.universityList = universityList; 
}

}