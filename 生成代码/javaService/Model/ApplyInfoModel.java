//
// ApplyInfoModel.java
//报考信息
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyInfoModel{

private String students;//生源地
private String enrollType;//批次
private String category;//科类
private Integer score;//分数
private Integer ranking;//排位
private String universityName;//目标院校
private String city;//目标城市
private String majorName;//目标专业
private String province;//省份

public String getStudents(){
   return this.students; 
}
public void setStudents(String students){
    if(students == null){
        this.students = "";
    }else{
        this.students = students;
    }
}
public String getEnrollType(){
   return this.enrollType; 
}
public void setEnrollType(String enrollType){
    if(enrollType == null){
        this.enrollType = "";
    }else{
        this.enrollType = enrollType;
    }
}
public String getCategory(){
   return this.category; 
}
public void setCategory(String category){
    if(category == null){
        this.category = "";
    }else{
        this.category = category;
    }
}
public Integer getScore(){
   return this.score; 
}
public void setScore(Integer score){
   this.score = score; 
}
public Integer getRanking(){
   return this.ranking; 
}
public void setRanking(Integer ranking){
   this.ranking = ranking; 
}
public String getUniversityName(){
   return this.universityName; 
}
public void setUniversityName(String universityName){
   this.universityName = universityName; 
}
public String getCity(){
   return this.city; 
}
public void setCity(String city){
   this.city = city; 
}
public String getMajorName(){
   return this.majorName; 
}
public void setMajorName(String majorName){
   this.majorName = majorName; 
}
public String getProvince(){
   return this.province; 
}
public void setProvince(String province){
   this.province = province; 
}

}