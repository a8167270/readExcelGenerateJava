//
// ApplyInfoModel.java
//报考信息
//
//
public class ApplyInfoModel implements Serializable{

private static final long serialVersionUID = 1L;
private String students;//生源地
private String enrollType;//批次
private String category;//科类
private int score;//分数
private int ranking;//排位
private String universityName;//目标院校
private String city;//目标城市
private String majorName;//目标专业
private String province;//省份

public String getStudents(){
    return this.students == null? "":students;
}
public void setStudents(String students){
   this.students = students; 
}
public String getEnrollType(){
    return this.enrollType == null? "":enrollType;
}
public void setEnrollType(String enrollType){
   this.enrollType = enrollType; 
}
public String getCategory(){
    return this.category == null? "":category;
}
public void setCategory(String category){
   this.category = category; 
}
public int getScore(){
   return this.score; 
}
public void setScore(int score){
   this.score = score; 
}
public int getRanking(){
   return this.ranking; 
}
public void setRanking(int ranking){
   this.ranking = ranking; 
}
public String getUniversityName(){
    return this.universityName == null? "":universityName;
}
public void setUniversityName(String universityName){
   this.universityName = universityName; 
}
public String getCity(){
    return this.city == null? "":city;
}
public void setCity(String city){
   this.city = city; 
}
public String getMajorName(){
    return this.majorName == null? "":majorName;
}
public void setMajorName(String majorName){
   this.majorName = majorName; 
}
public String getProvince(){
    return this.province == null? "":province;
}
public void setProvince(String province){
   this.province = province; 
}

}