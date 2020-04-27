package day16_ForLoopsCont;

public class NumberDiv3_5 {
    /*
     1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
     */

    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++ ){

            if(i % 2 != 0) {
            if(i %3 ==0 && i %5 ==0) {
                    System.out.print(i + " ");
                }
            }

        }





    }

}
