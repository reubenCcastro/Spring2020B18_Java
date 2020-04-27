package Repl_it;

import java.util.Scanner;

public class SaturdayWarmUpApr4 {
/*
    warmup tasks:
            1. write a program that can ask the user "enter a number"
            five times and return the maximum number
    hint: you will need for loop and if statement
	*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result = " ";

        int max = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int a = input.nextInt();
            if (max < a) {
                max = a;
            }
        }
            System.out.println("Max num is: "+max);



        }




    }

