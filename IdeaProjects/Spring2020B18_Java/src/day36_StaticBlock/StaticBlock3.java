package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {

    static String name;
    static int num;

    static Tester tester1;

    static {
            // static block gets executed first
            // values will be printed if called in antother class when called from this class
        name = "Mutar";
        num = 100;
            // in static block I can initialize values in two steps like this:
        tester1 = new Tester();
        tester1.setTesterInfo("Jean", 133, "SDET", 120000);// and I set the info in the parameter of the setInfo

    }
            /*
             // I want to initialize these variables in the main method like this:
             public static void main(String[] args) {
             name = "Muhtar";
             num =200;
             // but if I want to use them outside the class, I can call them by calling the class name but it will not print me values I set here
            // this main method only execute after we run.
            // so if we want to use these values outside class==> I have to initialize them in the static block like this:

            System.out.println(name);
            System.out.println(num);



             }
        
            */



}
