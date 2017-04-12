//
// ApplyUniversityModel.java
//申请院校
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyUniversityModel{

private String universityCode;//院校代码
private String universityName;//院校名称
private Integer chance;//录取概率
private List<ApplyMajorModel> majorList;//专业列表

public String getUniversityCode(){
   return this.universityCode; 
}
public void setUniversityCode(String universityCode){
    if(universityCode == null){
        this.universityCode = "";
    }else{
        this.universityCode = universityCode;
    }
}
public String getUniversityName(){
   return this.universityName; 
}
public void setUniversityName(String universityName){
    if(universityName == null){
        this.universityName = "";
    }else{
        this.universityName = universityName;
    }
}
public Integer getChance(){
   return this.chance; 
}
public void setChance(Integer chance){
   this.chance = chance; 
}
public List<ApplyMajorModel> getMajorList(){
   return this.majorList; 
}
public void setMajorList(List<ApplyMajorModel> majorList){
   this.majorList = majorList; 
}

}