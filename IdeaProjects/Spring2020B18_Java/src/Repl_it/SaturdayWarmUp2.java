package Repl_it;

import java.util.Scanner;
/*
2. write a program that can ask the user "enter a number" five times
	and return the minimum number
 */
public class SaturdayWarmUp2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 100;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int a = input.nextInt();
            if (min > a) {
                min = a;
            }
        }
        System.out.println("Min num is: "+min);
    }
}
