package day39_AccessModifiers;



public class Employee {
    String name;
    String jobTitle;
    int ID;
    double salary;


    public Employee(String name){
        this.name= name;
        jobTitle = "Unknown";
        ID = 0;
        salary = 0;
    }
    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
        ID = 0;
        salary = 0;
    }
    public Employee(String name, String jobTitle, int ID){
        this(name, jobTitle);
        this.ID = ID;
        salary = 0;
    }
    public Employee(String name, String jobTitle, int ID, double salary){
        this(name, jobTitle, ID);
        this.salary = salary;
    }
    public String toString(){
        return "Name is: "+name+",Job Tiltle is: "+jobTitle+", ID number: "+ID+"Salary is: $"+salary;
    }

}
class EmployeeObjects{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Reuben", "SDET", 9631, 96000);
        System.out.println(employee1);
    }
}
