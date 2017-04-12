//
// ApplyUniversityInfoRequest.java
// 
//
//
public class ApplyUniversityInfoRequest{

private ApplyInfoModel applyInfoModel;//学生报考信息
private int index;//获取院校索引
private int chanceType;//冲，稳，保类型（冲：1，稳：2，保：3）

public ApplyInfoModel getApplyInfoModel(){
   return this.applyInfoModel; 
}
public void setApplyInfoModel(ApplyInfoModel applyInfoModel){
   this.applyInfoModel = applyInfoModel; 
}
public int getIndex(){
   return this.index; 
}
public void setIndex(int index){
   this.index = index; 
}
public int getChanceType(){
   return this.chanceType; 
}
public void setChanceType(int chanceType){
   this.chanceType = chanceType; 
}

}