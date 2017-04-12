package com.zte.node.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zte.node.basebean.RequestBase;//
// WillFormRequest.java
// 
//
//
public class WillFormRequest extends RequestBase{

private Integer willFormId;//志愿表ID

public Integer getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(Integer willFormId){
   this.willFormId = willFormId; 
}
public boolean checkValidRequestInfo() {
 return !Tools.isNullorEmpty(willFormId) ;
}

}