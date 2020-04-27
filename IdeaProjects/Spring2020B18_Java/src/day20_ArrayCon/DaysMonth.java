package day20_ArrayCon;

import java.util.Scanner;

public class DaysMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                        // size :7 max index number:6
        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempts = 1;
        while(num>7 || num < 1){
            System.out.println("Invalid Entry");
            // System.exit(0);use if we want to stop the program nothing else will happen
            System.out.println("Please re-enter the number");// use this if you want person to enter another number
            num = input.nextInt();
            attempts++;

            if(attempts == 3 && (num >7 || num < 1) ){// this is for you have number of attempts so you will use while loop
                System.exit(0);
            }
        }



        String result = days[num-1];

        System.out.println(result);

    }


}
