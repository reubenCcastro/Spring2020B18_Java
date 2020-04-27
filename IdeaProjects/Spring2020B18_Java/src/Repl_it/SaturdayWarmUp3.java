package Repl_it;

import java.util.Scanner;

public class SaturdayWarmUp3 {
    public static void main(String[] args) {
        /*3. write a program that can ask the user to
        "enter a word" five times
	     and returns the word that has the maximum length  */

        Scanner input = new Scanner(System.in);
        String result = "";

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a word");
            String count = input.nextLine();
            if (count.length()>result.length()){
                result = count;
            }
        }
        System.out.println("the longest word is: "+result);

    }
}
