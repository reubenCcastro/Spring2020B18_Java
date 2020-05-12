package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name;

    static Tester tester1 = new Tester();
            //tester1.setInfo("Muhtar", 123, "SDET", 120000);
            // instance variable
    int insVariable;

    static{ // static block  designed for statics only

            //static block get executed as soon as the class is loaded
            //static block designed to initialized static variable
        name = "Cybertek";
        tester1.setTesterInfo("Muhtar", 123, "SDET", 120000);
            //static block gets ececuted from top to bottom
        tester1.setTesterInfo("Namik", 1245, "SDET", 120000);
            // to call instance variable into static block ==> I have to create an object first ==> then call my instance variable
            //StaticBlock4 obj1 = new StaticBlock4();
            //obj1.insVariable = 300;  // DO NOT use static block for initializing instance variables

    }
            // if I have a main method like this:
    public static void main(String[] args) {
        System.out.println(name);
            // and I have a print statement:
            //System.out.println(tester1);
            // since static block gets executed first
            // and since we initialized the value of name in the static block
            // when we request to print name here ==> it will print the value we initialized in the static block
            // if we dont' initialize this value in the static block ==> it will print null here
            // we can still initialize the value of name in the class (above) once we created our static variable
            // But if we want to create a static variable and then set information for our variable (like what we did with tester1, or developer)
            // ==> we can not do two steps in class : like creating a variable + initializing info of variable in two steps
            // ==> better to do in static block

            // here I will create another object from this class to use my instance variable insVariable:
        StaticBlock4 obj2 = new StaticBlock4();
            // System.out.println( obj2.insVariable ); // 0
    }
}
