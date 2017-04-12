//
// WillFormModifyModel.java
//志愿表修改信息
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WillFormModifyModel{

private String univsersityModify;//院校名称
private List<String> majorModifyList;//专业修改信息

public String getUnivsersityModify(){
   return this.univsersityModify; 
}
public void setUnivsersityModify(String univsersityModify){
    if(univsersityModify == null){
        this.univsersityModify = "";
    }else{
        this.univsersityModify = univsersityModify;
    }
}
public List<String> getMajorModifyList(){
   return this.majorModifyList; 
}
public void setMajorModifyList(List<String> majorModifyList){
   this.majorModifyList = majorModifyList; 
}

}