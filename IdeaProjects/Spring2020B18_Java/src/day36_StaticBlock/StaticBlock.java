package day36_StaticBlock;

public class StaticBlock {
         /*
         whenever we have a static variable, its better to use it inside of static { block, that way you can use it outside the class.
         even tho java runs top to bottom, if we have a main method after we have static block, the static will execute first
         To call the static variable, we need to call it through the class name.
         static block runs first and runs once
         Static block is needed to initialize static variables to be used later
         */
    public static void main (String[ ]args) {
        System.out.println("Main method executed");
        method1();
        int a=20;
        System.out.println(a);
        }


    public static void method1(){
        System.out.println("Custom method executed");// will not run if not in main method so add "method1();" to main method
        int a=20;
        System.out.println(a);
    }
           // static block runs first
           // static block runs only once
           // it is executed as soon as class is loaded
    static{
        System.out.println("static block executed");//runs first even before the main method only run one time
        int a=20;
        System.out.println(a);
    }
}
