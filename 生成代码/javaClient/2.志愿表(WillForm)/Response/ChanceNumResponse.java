//
// ChanceNumResponse.java
// 
//
//
public class ChanceNumResponse implements Serializable{

private static final long serialVersionUID = 1L;
private ChanceNumModel chanceNumModel;//“冲、稳、保”院校数量

public ChanceNumModel getChanceNumModel(){
   return this.chanceNumModel; 
}
public void setChanceNumModel(ChanceNumModel chanceNumModel){
   this.chanceNumModel = chanceNumModel; 
}

}