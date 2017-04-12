//
// ChanceNumModel.java
//冲、稳、保院校数量
//
//
public class ChanceNumModel implements Serializable{

private static final long serialVersionUID = 1L;
private int riskCount;//“冲”院校数量
private int stableCount;//“稳”院校数量
private int safeCount;//“保”院校数量

public int getRiskCount(){
   return this.riskCount; 
}
public void setRiskCount(int riskCount){
   this.riskCount = riskCount; 
}
public int getStableCount(){
   return this.stableCount; 
}
public void setStableCount(int stableCount){
   this.stableCount = stableCount; 
}
public int getSafeCount(){
   return this.safeCount; 
}
public void setSafeCount(int safeCount){
   this.safeCount = safeCount; 
}

}