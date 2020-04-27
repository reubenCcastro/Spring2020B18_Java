package day12_JavaRecep;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        /*
        Write a program that calculates the sum of maximum of 5 positive numbers entered by the user.
If the user enters negative number or zero, it is skipped from calculation

         */

        System.out.println("Enter five numbers");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double sum = 0;

        if(num1 >0 ) {
            sum += num1;
        }

        if(num2 >0){
            sum += num2;
        }

        if(num3 >0){
            sum += num3;
        }

        if(num4 >0){
            sum += num4;
        }

        if(num5>0){
            sum +=num5;
        }

        System.out.println("sum of positive numbers are: "+sum);

        /*
     Assignment:
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
                Ex:
                    5, 4, 1, 2, 3
                 output:
                    1, 2, 3, 4, 5
         */




    }
}
