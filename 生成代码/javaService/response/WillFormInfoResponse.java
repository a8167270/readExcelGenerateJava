//
// WillFormInfoResponse.java
// 
//
//
package com.zte.node.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zte.node.basebean.ResponseBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WillFormInfoResponse extends ResponseBase{

private WillFormModel willFormInfo;//志愿表

    public WillFormInfoResponse(Integer RESULT,String EVENT){
        super(RESULT,EVENT);
    }
public WillFormModel getWillFormInfo(){
   return this.willFormInfo; 
}
public void setWillFormInfo(WillFormModel willFormInfo){
   this.willFormInfo = willFormInfo; 
}

}