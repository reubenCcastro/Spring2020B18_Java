package day34_CustomClass;

public class Offer {
    String Location;
    String Company;
    Integer Salary;
    Boolean IsfullTime;

    public void setofferInfo(String Location,String Company,Integer Salary, Boolean IsfullTime){
        this.Location = Location;
        this.Company = Company;
        this.Salary = Salary;
        this.IsfullTime = IsfullTime;
    }
    public String toString(){
        return  "Location is: "+Location+", Company is: "+Company+", Salary is:$"+Salary+" This is a Full time position";
    }
}
