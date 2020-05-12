package day34_CustomClass;

public class Tester {
                /*
                 create a class called Testers
			        Attributes:
				        name, employeeID, JobTitle, Salary
			        Actions:
				        setTesterInfo(), smokeTesting(),  creatingTicket();
                */

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
                    // if we don't use this keyword, by default, system will call local variable not instance variable
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }// now we will create a class called bank of America

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", employee id: "+employeeID+", salary: "+salary;
    }


}
