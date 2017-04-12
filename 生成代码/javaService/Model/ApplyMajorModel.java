//
// ApplyMajorModel.java
//专业
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyMajorModel{

private String majorName;//专业名称
private String innerCode;//内部代码

public String getMajorName(){
   return this.majorName; 
}
public void setMajorName(String majorName){
    if(majorName == null){
        this.majorName = "";
    }else{
        this.majorName = majorName;
    }
}
public String getInnerCode(){
   return this.innerCode; 
}
public void setInnerCode(String innerCode){
    if(innerCode == null){
        this.innerCode = "";
    }else{
        this.innerCode = innerCode;
    }
}

}