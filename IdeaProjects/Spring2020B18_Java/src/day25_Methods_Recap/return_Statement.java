package day25_Methods_Recap;

public class return_Statement {

    public static void main(String[] args) {
         /*
        if(10 >9){
            return;  // exits the current method only
        }
        System.out.println("Hello");
        */

        method1();

        System.out.println("Hello"); // only thin that print
    }

    public static void method1(){ // to use the void methods you
        // can not return a value, just to exit the method

        if(10 > 9){
            return;
        }

        System.out.println("Hello Cybertek"); // doesn't print this because of the return statement
        //it only prints out what in the main method which is Hello.
    }


    public static void method2(){
        if(10 > 9){
            System.exit(0);//
        }

        System.out.println("Hello Cybertek"); // does not print because this System.exit(0); exits

    }
}
