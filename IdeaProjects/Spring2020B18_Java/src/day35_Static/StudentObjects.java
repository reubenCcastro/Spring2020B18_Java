package day35_Static;

public class StudentObjects {
    public static void main(String[] args) {



        Student student1 = new Student();
        System.out.println(student1);//  Name: null, School Name: Cybertek
                    // because school name is static it is the same for all, and it gets printed
                    // Whereas the name is an instance variable (now null). It will only get printed after we assign a value to it like this:
        student1.name = "Muhtar";
        System.out.println(student1);// Name: Muhtar, School Name: Cybertek


        Student student2 = new Student();
        student2.name = "Kuzzat";
        System.out.println(student2);
                    // to print out name of school, I can call the printSchoolName() method (static method) from class name Student like this:
        Student.printSchoolName();  //   School name is Cybertek
                    // static method is preferred to be called from Class name (Student in our case here)
                    // We can still call a static method from our object name (after we create it) but it is always preferred to be called by class name.
    }
}



