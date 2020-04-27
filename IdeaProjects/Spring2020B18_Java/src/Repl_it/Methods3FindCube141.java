package Repl_it;
/*
Given method called cube. Write all required code inside this method in
order  to asks the user for a number and then prints the cubed value of
that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */

import java.util.Scanner;

public class Methods3FindCube141 {

    public static void cube()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();

        System.out.println("Output:"+(num*num*num));




    }//end cube

    public static void main(String[] args) {

        cube();

    }
}

