package day35_Static;

public class staticVariables2 {

    int  insVariable;    // every single object has its own copy of instance variable because instance variable belongs to the OBJECT
    static int staticVariable;    //all objects we create share the same static variable because static variable belongs to the CLASS

    public static void main(String[] args) {

        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable = 300;// 1 copy is created for each object
        obj1.staticVariable = 400;// 1 copy is created for all objects in one class

        staticVariables2 obj2 = new staticVariables2();


        System.out.println(   obj1.insVariable  ); // 300 because we initialized it already
        System.out.println( obj2.insVariable );   //0  default value not initialized yet

        System.out.println(); // to print empty line

        System.out.println(  obj1.staticVariable );  // 400 because it's declared already
        System.out.println( obj2.staticVariable );// 400 because it is declared already once

        System.out.println();// to print empty line
                        // I can call my static variable through the class name like this because it belongs to the class:
        System.out.println( staticVariables2.staticVariable ); // static can be called through class name
        //  System.out.println( staticVariables2.insVariable ); // instance CAN NOT be called through class name
                        // I can call my instance variable through the object only because it belongs to the object but
                        // ==> but I can NOT call instance variable through the class name because it does not belong to class
                        // we can call static variables through the object's name (because objects are contained in the class
                        // But preferred way to call static variables is through class name

    }

}
