package day10_Switch_Scanner;

import java.util.Scanner;    //import java.util.Scanner; this is what you write

public class ScannerClass_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
                    byte num1 = input.nextByte();
        System.out.println("Enter your second number");
                    byte num2 = input.nextByte();
                    int total = (num1+num2);
        System.out.println("The sum of those two number are: "+ total);
    }
}
