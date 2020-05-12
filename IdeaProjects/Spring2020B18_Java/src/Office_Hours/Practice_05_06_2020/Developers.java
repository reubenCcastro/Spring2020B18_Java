package Office_Hours.Practice_05_06_2020;

public class Developers {
    String name;
    long employeeID;
    String jobTitle;
    double salary;
            // Now we create our actions==> first action is our setInfo() method
            // in this setInfo() method we are passing parameters = local variables because they are declared within the method
    public void setDeveloperInfo(String name, long employeeID, String jobTitle, double salary){
            // now I need to assign the local variables that I'm passing here in the parameters to my instance variables = the attributes
            // because the local variable has the same name like the instance variable ==> we need to use "this." keyword to call the instance variable
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
            // this is the method that can allow me to set the info of the object when we create it.
            // I can call this method after creating my object then set the info of each object by passing parameters
            // the only time we use "this." to call instance variable is when there is a local variable sharing the same name
    }
    public void coding(){
        System.out.println(name+" is coding");

    }
    public void fixingBugs(){
        System.out.println(name+" fixes bugs");

    }
            // whatever I pass here to be returned ==> it will print once I pass my object developer1 in the print mehtod
            // If I return this sentence here: return "Hello how are you"; ==> this sentence will get printed once I pass my object in the print statement
            // that's why I need to return here what I would like to see when I pass my object in the print statement like this:
    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", employee id: "+employeeID+", salary: "+salary;
    }
}




