package day37_Contructors;

import day37_Contructors.Student;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Mike", 25,'M',"Cybertek University");
        //student1.setInfo("Mike", 25,'M',"Cybertek University");since we made constructor i can put information directly in the new.
        System.out.println(student1);

        Student student2 = new Student("Smith", 28, 'M', "Cybertek University");
        System.out.println(student2);

        Student student3 = new Student("Mary", 32, 'F', "Cybertek University");
        System.out.println(student3);

    }
}
