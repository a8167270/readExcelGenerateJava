//
// WillFormModifyModel.java
//志愿表修改信息
//
//
public class WillFormModifyModel implements Serializable{

private static final long serialVersionUID = 1L;
private String univsersityModify;//院校名称
private List<String> majorModifyList;//专业修改信息

public String getUnivsersityModify(){
    return this.univsersityModify == null? "":univsersityModify;
}
public void setUnivsersityModify(String univsersityModify){
   this.univsersityModify = univsersityModify; 
}
public List<String> getMajorModifyList(){
   return this.majorModifyList; 
}
public void setMajorModifyList(List<String> majorModifyList){
   this.majorModifyList = majorModifyList; 
}

}