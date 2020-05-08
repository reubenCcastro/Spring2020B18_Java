package day35_Static;
/*
1. Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime
    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers

 */
public class Offer {
    String Location;//instance variable
    String Company;
    Integer Salary;
    Boolean IsfullTime;

    public void setofferInfo(String Location,String Company,Integer Salary, Boolean IsfullTime){//Local variable
        this.Location = Location;//when we this. we can use the same local and instance variable.
        this.Company = Company;
        this.Salary = Salary;
        this.IsfullTime = IsfullTime;
    }
    public String toString(){
        return  "Location is: "+Location+", Company is: "+Company+", Salary is:$"+Salary+" This is a Full time position";
    }
}
