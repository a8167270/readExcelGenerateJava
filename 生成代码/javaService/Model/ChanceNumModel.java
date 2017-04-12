//
// ChanceNumModel.java
//冲、稳、保院校数量
//
//
package com.zte.node.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChanceNumModel{

private Integer riskCount;//“冲”院校数量
private Integer stableCount;//“稳”院校数量
private Integer safeCount;//“保”院校数量

public Integer getRiskCount(){
   return this.riskCount; 
}
public void setRiskCount(Integer riskCount){
   this.riskCount = riskCount; 
}
public Integer getStableCount(){
   return this.stableCount; 
}
public void setStableCount(Integer stableCount){
   this.stableCount = stableCount; 
}
public Integer getSafeCount(){
   return this.safeCount; 
}
public void setSafeCount(Integer safeCount){
   this.safeCount = safeCount; 
}

}