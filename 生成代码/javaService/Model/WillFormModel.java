//
// WillFormModel.java
//志愿表Model
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WillFormModel{

private Integer willFormId;//志愿表ID
private ApplyInfoModel applyInfo;//报考信息
private List<ApplyUniversityModel> universityList;//院校列表
private String notes;//提示语

public Integer getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(Integer willFormId){
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
   return this.notes; 
}
public void setNotes(String notes){
   this.notes = notes; 
}

}