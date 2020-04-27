package day15_ForLoop;

import java.util.Scanner;
/*
warmup tasks:
	1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB*/
public class InitialOfName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.next();

        System.out.println("Enter last name");
        String lastName = input.next();

        String initials = firstName.substring(0,1) + lastName.substring(0,1);
        initials = initials.toUpperCase();

        System.out.println(initials);


         //char firstName1 = firstName.charAt(0);
        //char lastName1 = lastName.charAt(0);
        //String Initials = firstName1+" "+lastName1;
        //System.out.println(Initials.toUpperCase());



    }
}
