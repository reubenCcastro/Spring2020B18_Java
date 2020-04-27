package day26_MethodsOverloading;

public class MethodOverloading {


    public static void main(String[] args) {
        method(10);//prints ("Original method");
        method(10.0);//prints ("Overloaded method");

    }
    public static void method(int a){
        System.out.println("Original method");


    }
    public static void method(double a){
        System.out.println("Overloaded method");
    }
}
