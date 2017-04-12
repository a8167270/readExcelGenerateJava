//
// UniversityListResponse.java
// 
//
//
package com.zte.node.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zte.node.basebean.ResponseBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UniversityListResponse extends ResponseBase{

private List<ApplyUniversityModel> universityList;//“冲,稳，保”院校列表

    public UniversityListResponse(Integer RESULT,String EVENT){
        super(RESULT,EVENT);
    }
public List<ApplyUniversityModel> getUniversityList(){
   return this.universityList; 
}
public void setUniversityList(List<ApplyUniversityModel> universityList){
   this.universityList = universityList; 
}

}