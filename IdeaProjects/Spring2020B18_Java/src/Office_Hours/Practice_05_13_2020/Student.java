package Office_Hours.Practice_05_13_2020;

public class Student {

    /*
    Student
                int variable: name, id
                instance methods:to string
     */

    /*
   Student:
            ins variables: name, id
            intsance methods: toString
    */
    String name;
    long id;
    static String schoolName = "Cybertek";

    public  String toString(){
        return "Name: "+ name+", id: "+id+", School Name: "+schoolName;
    }

    public static void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}
