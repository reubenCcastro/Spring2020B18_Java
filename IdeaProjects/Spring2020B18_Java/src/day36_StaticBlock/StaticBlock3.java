package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {

    static String name;
    static int num;

    static Tester tester1;

    static {
        name = "Mutar";
        num = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("Jean", 133, "SDET", 120000);

    }
/*
      public static void main(String[] args) {
        name = "Muhtar";
        num =200;

        System.out.println(name);
        System.out.println(num);



        }
        
 */



}
