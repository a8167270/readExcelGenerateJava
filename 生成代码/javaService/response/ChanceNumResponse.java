//
// ChanceNumResponse.java
// 
//
//
package com.zte.node.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zte.node.basebean.ResponseBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChanceNumResponse extends ResponseBase{

private ChanceNumModel chanceNumModel;//“冲、稳、保”院校数量

    public ChanceNumResponse(Integer RESULT,String EVENT){
        super(RESULT,EVENT);
    }
public ChanceNumModel getChanceNumModel(){
   return this.chanceNumModel; 
}
public void setChanceNumModel(ChanceNumModel chanceNumModel){
   this.chanceNumModel = chanceNumModel; 
}

}