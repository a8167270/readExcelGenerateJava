//
// InviteCodeModel.java
//申请院校
//
//
public class InviteCodeModel implements Serializable{

private static final long serialVersionUID = 1L;
private String universityCode;//院校代码
private String universityName;//院校名称
private int chance;//录取概率
private List<ApplyMajorModel> majorList;//专业列表

public String getUniversityCode(){
    return this.universityCode == null? "":universityCode;
}
public void setUniversityCode(String universityCode){
   this.universityCode = universityCode; 
}
public String getUniversityName(){
    return this.universityName == null? "":universityName;
}
public void setUniversityName(String universityName){
   this.universityName = universityName; 
}
public int getChance(){
   return this.chance; 
}
public void setChance(int chance){
   this.chance = chance; 
}
public List<ApplyMajorModel> getMajorList(){
   return this.majorList; 
}
public void setMajorList(List<ApplyMajorModel> majorList){
   this.majorList = majorList; 
}

}