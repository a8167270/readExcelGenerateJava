//
// ApplyMajorModel.java
//专业
//
//
public class ApplyMajorModel implements Serializable{

private static final long serialVersionUID = 1L;
private String majorName;//专业名称
private String innerCode;//内部代码

public String getMajorName(){
    return this.majorName == null? "":majorName;
}
public void setMajorName(String majorName){
   this.majorName = majorName; 
}
public String getInnerCode(){
    return this.innerCode == null? "":innerCode;
}
public void setInnerCode(String innerCode){
   this.innerCode = innerCode; 
}

}