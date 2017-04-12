//
// WillFormModifyRecordResponse.java
// 
//
//
package com.zte.node.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zte.node.basebean.ResponseBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WillFormModifyRecordResponse extends ResponseBase{

private WillFormPushModel willFormPushInfo;//志愿表推送信息
private WillFormModel willFormInfo;//志愿表

    public WillFormModifyRecordResponse(Integer RESULT,String EVENT){
        super(RESULT,EVENT);
    }
public WillFormPushModel getWillFormPushInfo(){
   return this.willFormPushInfo; 
}
public void setWillFormPushInfo(WillFormPushModel willFormPushInfo){
   this.willFormPushInfo = willFormPushInfo; 
}
public WillFormModel getWillFormInfo(){
   return this.willFormInfo; 
}
public void setWillFormInfo(WillFormModel willFormInfo){
   this.willFormInfo = willFormInfo; 
}

}