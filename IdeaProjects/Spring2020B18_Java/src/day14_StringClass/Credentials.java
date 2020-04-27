package day14_StringClass;
import java.util.Scanner;
public class Credentials {
/*

        userName: cybertek
        passWord: cybertekschool

 */
    public static void main(String[] args) {


        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name:");

        String inputUserName = input.next();

        System.out.println("Enter your password");

        String inputPassWord = input.next();

        boolean validCredentials =  inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord);

        if( inputUserName.equals(inputUserName) && inputPassWord.equals(validPassWord)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }








    }
}
