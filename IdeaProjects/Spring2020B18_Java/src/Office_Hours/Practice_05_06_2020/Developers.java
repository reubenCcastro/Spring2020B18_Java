package Office_Hours.Practice_05_06_2020;

public class Developers {
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setDeveloperInfo(String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void coding(){
        System.out.println(name+" is coding");

    }
    public void fixingBugs(){
        System.out.println(name+" fixes bugs");

    }

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", employee id: "+employeeID+", salary: "+salary;
    }
}


