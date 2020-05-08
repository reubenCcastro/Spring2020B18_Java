package day36_StaticBlock;

public class StaticBlock {

    public static void main (String[ ]args) {
        System.out.println("Main method executed");
        method1();
        }


    public static void method1(){
        System.out.println("Custom method executed");// will not run if not in main method so add "method1();" to main method
    }

    static{
        System.out.println("static block executed");//runs first even before the main method only run one time
    }
}
