package day14_StringClass;
import java.util.Scanner;
public class combiningTwoStrings2 {

    /*
    2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
    Input:
    apple
            banana
    Output:
    ppleanana
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();
            firstWord = firstWord.substring(1);

        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();
        secondWord = secondWord.substring(1);

        String result = firstWord+secondWord;


        System.out.println(result);

    }
}
