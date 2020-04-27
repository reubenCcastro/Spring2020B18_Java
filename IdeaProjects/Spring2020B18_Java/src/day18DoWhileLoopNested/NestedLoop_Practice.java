package day18DoWhileLoopNested;

import java.util.Scanner;
/*
add *,/, -,+, and switch statement char things
 */
public class NestedLoop_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();
            while(  ! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, please enter yes or no");
                answer = input.next();
            }



            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }
        }
    }
}

