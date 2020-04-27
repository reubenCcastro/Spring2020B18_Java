package day17_WhileLoops;

import java.util.Scanner;
/*
Warmup tasks:
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement

 */
public class MaxandMinFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber = -2147483647;
        int minNumber =  2147483647;



        for(int i = 0; i < 6; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > maxNumber) {
                maxNumber = num;
            }

            if(num < minNumber){
                minNumber = num;
            }
        }
            System.out.println("Maximum number:" +maxNumber);
        System.out.println("Minimum number:"+minNumber);

    }

    }

