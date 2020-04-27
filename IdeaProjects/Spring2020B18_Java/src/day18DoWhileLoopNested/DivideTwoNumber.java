package day18DoWhileLoopNested;

//import java.util.Scanner;

public class DivideTwoNumber {
    /*
    1. write a program that can divide two numbers.
                NOTE: DO NOT USE division, multiplication, or module operators

     */
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter seceond number");
        int num2 = input.nextInt();
        System.out.println("Math operator");
        String operator = input.next();

        for(int i = 0; i > 2; i++){
        } if(operator.equals("/")) {
            System.out.println("Division is: " + (num1 / num2));
        }
        System.out.println("======================");
          10 - 3 - 3 - 3 = 1
          a = a - b = 7;
          a = a - b = 4;
          a = a - b = 1;
           COUNT =  3;   a = 1;
         */


        int a = 10;
        int b = 3;

        if(b == 0){
            System.out.println("divisor cannot be zero");
            System.exit(0);
        }

        int count = 0;


        while (a >= b) {
            a -= b;
            count++;
        }
        if (a == 0) {
            System.out.println("The result is " + count);
        } else {
            System.out.println("The result is " + count + " with a remainder of " + a);

        }

    }
}




