package day29_WrapperClassArrayList;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();//size : 0
        //        Mandatory                       Optional
        //• DataType: CAN NOT BE PRIMITIVE!
        //• ArrayList does not support primitives, ONLY supports non-primitives

        scores.add(10);// Autoboxing   size of the Arrray:1
        scores.add(20);// Autoboxing   size of the Arrray:2
        scores.add(30);// Autoboxing   size of the Arrray:3

        System.out.println(scores);

        Integer a1 = scores.get(2); //none
        int a2 = scores.get(2);// unboxing
        double a3 = scores.get(2);// unboxing
        System.out.println(a3);

        //  System.out.println( scores.get(100) ); //index out of bound





    }


}
