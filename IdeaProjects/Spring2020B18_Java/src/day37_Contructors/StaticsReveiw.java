package day37_Contructors;

class dog{

    String name;  // only belong to the objects of dog class
    int age;  // only belong to the objects of dog class

    public void setInfo(String name, int age){
        name = name;
        age = age;
    }

}


class Test{
    public static void main(String[] args) {
        // Test obj = new Test();
        dog obj = new dog();
        System.out.println(obj.name);
        System.out.println(obj.age);

        dog obj2 = new dog();
        obj2.setInfo("Lucy", 4);

        System.out.println(obj2.name ); // null
        System.out.println(obj2.age); //0


    }
}

public class StaticsReveiw {
                //Instance variables (Fields)  belong to the object. each object has its own copies of instance variables.
                 //Any feature that has a static keyword belongs to the class members. Class members are shared by the class and objects.
                //STATIC : methods, variables, block and nested classes can be static.
                // only one copy of static variable is shared by all objects
                // each object has its own copy of instance variable
                // if we have multiple objects ==> they will share same STATIC variable but different INSTANCE variable
                //
    static int a;  //1 copy
    int b; // 2, each object has its own copy of instance variable

    static String name = "John";
    String id = "123";

    public static void main(String[] args) {
        StaticsReveiw obj1 = new StaticsReveiw();
        obj1.a = 20;
                    // static variable : only one copy for all objects
        obj1.b = 10;
                    // instance variable b : each object has its own copy
        StaticsReveiw obj2 = new StaticsReveiw();
        obj2.a = 30;
        // static variable : only one copy for all objects
        obj2.b = 40;

        System.out.println(obj1.a);  // 30 : because second time we initialized a as 30
        System.out.println( obj2.a );  // 30 : same as above because once static variable is given a value ==> it is the same for all objects
        // since we gave it a value 20 first then we changed it to 30 ==> static variable a value = 30


        System.out.println(obj1.b); // 10 was initialized above
        System.out.println( obj2.b ); // 40 : it was not initialized at all ==> default value
        // each object has its own value of instance variable

        System.out.println("==========================================");

        System.out.println(name);
        // System.out.println( id );  // static only accept static,

    }


}
