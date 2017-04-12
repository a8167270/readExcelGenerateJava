//
// SaveWillFormResponse.java
// 
//
//
package com.zte.node.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zte.node.basebean.ResponseBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveWillFormResponse extends ResponseBase{

private int willFormId;//志愿表ID

    public SaveWillFormResponse(Integer RESULT,String EVENT){
        super(RESULT,EVENT);
    }
public int getWillFormId(){
   return this.willFormId; 
}
public void setWillFormId(int willFormId){
   this.willFormId = willFormId; 
}

}