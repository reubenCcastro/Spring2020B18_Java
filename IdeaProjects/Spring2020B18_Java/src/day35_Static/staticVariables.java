package day35_Static;

public class staticVariables {


    int a2 = 200; // instance variables

    static int a3 = 300; // static variables

    public static void main(String[] args) {
        int a1 = 100; // local variable

        staticVariables obj1 = new staticVariables();
        System.out.println(a1);//100
        obj1.a2 = 1000; //copy in obj1 is different
                // instance means each object has its own copy
                // whereas static variable = one copy shared by all the objects
                // so:
        obj1.a3 = 4000;

        staticVariables obj2 = new staticVariables();
        obj2.a2 = 2000;

        obj2.a3 = 5000;


        System.out.println(obj1.a2);//1000
        System.out.println(obj2.a2);//2000
                // since a3 is static ==> all objects share the same copy of a3
        System.out.println(obj1.a3); // 5000 //there is only one copy of static shared by all objects
        System.out.println(obj2.a3); // 5000 //there is only one copy of static shared by all objects
        //once we declare that static copy ==> this is the value of our variable

    }
}
