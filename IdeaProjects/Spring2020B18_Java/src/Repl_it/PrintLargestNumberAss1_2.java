package Repl_it;

import java.util.Scanner;
/*
In this problem you need to write a program that checks for the bigger
of 3 numbers.

You are given 3 int variables: num1 , num3 and num3.

if num1 is biggest - output: "n1 is bigger"
if num2 is biggest - output: "n2 is bigger"
if num3 is biggest - output: "n3 is bigger"



 */
public class PrintLargestNumberAss1_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        //your code here

        for (int i = 0; i < 3; i++) {
            if (num1 > num2 && num1 > num3) {
                System.out.println("n1 is bigger");
            } else if (num2 > num3 && num2 > num1) {
                System.out.println("n2 is bigger");
            } else if (num3 > num1 && num3 > num2) {
                System.out.println("n3 is bigger");


            }
        }

    }
}
