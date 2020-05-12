package day36_StaticBlock;

import java.util.ArrayList;
            /*1. Create a class called Employee
                    instance variables:
                    name, id, ssn, jobTitle, salary, gender
                    actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
            */
class Employee {

                String name;
                long id;
                int ssn;
                String jobTitle;
                char gender;

    // call this setEmployeeInfo method to use more than one
    public void setEmployeeInfo(String name, long id, int ssn, String jobTitle, char gender) {
        //the object variables is initialized with this "this."
        // they have there own copies of the objects.
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }
// when ever the printstatment is ran this statement coverts automatically.
    public String toString() {
        return "Employee name: " + name + ", ID #: " + id + "; SSN: " + ssn + ", job title is: " + jobTitle + ", Gender is: " + gender;
    }
}
                /*
                 2. create a class called HumanResources
		    	            declare 5 variables of Employee as static
			                use static block to:
						        1. initialize those static variables
						        2. set all the info of the Employees
         */
    class HumanR3sources {
                    // static purpose is to initialize the static variable
                    // can the variables be static? yes
                    //if you try to print now it will give you null cause we have not initialized the instance variables
    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();
                    //     static variable now == assign object to the variable name

    static {
        employee1.setEmployeeInfo("Reuben", 111111, 123123121, "SDET", 'M');
        employee2.setEmployeeInfo("Cliff", 222222, 231231231, "QA", 'M');
        employee3.setEmployeeInfo("Castro", 223142, 321321321, "Senior SDET", 'M');
        employee4.setEmployeeInfo("Karolina", 432432, 432432211, "Scrum Master", 'F');
        employee5.setEmployeeInfo("Junior", 543543, 543543211, "Boss", 'M');
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee4);
        System.out.println("============================================");
                 // if i have to use these static variable will the be initialize.
                 // if i use these static variable in the main mehod it will not run in another class so you need th// is static
                 //static is exectues as soon as the class is run
                // were should i declare the static block? it does not matter were you put
                // static block gets executed first
    }
    }

    public class BankOfAzerbaijan {
            /*
            3. create class called BankOfAzerbaijan
		            in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
               */

        public static void main(String[] args) {
// the main advantage of having
            // you can call the employee info from another class by calling it
            ArrayList<Employee> listOfEmployee = new ArrayList<>();
            listOfEmployee.add(HumanR3sources.employee1);
            listOfEmployee.add(HumanR3sources.employee5);
            // if you only wanted to print out one you can use the .get and index number to pring
            System.out.println(listOfEmployee.get(0));
            System.out.println(listOfEmployee.get(1));
            System.out.println("=============================");


            for (Employee each : listOfEmployee) {
                System.out.println(each);
            }
        }
    }

