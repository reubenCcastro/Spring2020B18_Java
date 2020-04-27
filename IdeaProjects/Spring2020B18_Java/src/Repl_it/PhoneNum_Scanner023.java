package Repl_it;
import java.util.Scanner;
public class PhoneNum_Scanner023 {
    public static void main(String[] args) {
/*
Write a program that asks user to input int values: areaCode and
localNumber.

-Using concatenation put together in this format and assign to String
phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444

 */
        Scanner input=new Scanner(System.in);

        int areaCode = input.nextInt();
        int localNumber =input.nextInt();
        String phoneNumber ="Calling number " + "("+areaCode+")-"+localNumber;

        System.out.println (phoneNumber);
    }


}
