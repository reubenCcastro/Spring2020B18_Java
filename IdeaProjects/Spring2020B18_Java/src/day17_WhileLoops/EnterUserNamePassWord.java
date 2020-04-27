package day17_WhileLoops;

import java.util.Scanner;

/*
Write a program that asks user to enter his/her username and password until user enters
correctly.
 */
public class EnterUserNamePassWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //userName = "CastroReuben";
        //passWord = "123Metheds";

        System.out.println("Enter User Name: ");
        String userName = input.next();

        System.out.println("Enter Password: ");
        String passWord = input.next();

        boolean valid = (userName.equals("CastroReuben") && passWord.equals("123Metheds"));

        int count  =1;


        // while (!(userName.equals("CastroReuben")&& passWord.equals("123Metheds"))){
            while( !valid ) {
                System.out.println("Please re enter your credentials");
                System.out.println("Enter User Name");
                userName = input.next();
                System.out.println("Enter Pass word");
                passWord = input.next();

                valid = (userName.equals("CastroReuben") && passWord.equals("" + "123Metheds"));
                count++;

                if (count == 3 && !valid) { // already have three attempts and creditials are still not correct
                    System.out.println("Your account is locked");
                    break;
                }

            }

            if (valid){ // creditials are correct
                System.out.println("Logged in");

            }
            }




    }

