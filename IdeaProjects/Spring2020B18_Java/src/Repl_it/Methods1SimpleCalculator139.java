package Repl_it;

import java.util.Scanner;
/*
create a static method called "plus", its return is void and it gets no
arguments.

It asks the user to input two numbers, then it will add them and print the
result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
public class Methods1SimpleCalculator139 {

    public static void main(String[] args) {

        plus();
    }

    public static void plus(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num = input.nextInt();

        System.out.println("Enter second number:");
        int num1 = input.nextInt();

        int sum;
        sum = num + num1;

        System.out.println("result: "+sum);

    }


}
