package day20_ArrayCon;

import java.util.Scanner;

public class MonthsName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] months= {"January", "February", "March", "April", "May", "June", "July",
                //          0           1           2       3       4       5       6
                "August", "September", "October", "November", "December"};
        //          7       8               9       10          11
        System.out.println("Enter a number");
        int num = input.nextInt();
        while(num > 12 || num <= 0){
            System.out.println("Invalid Entry");
           // System.exit(0);use if we want to stop the program nothing else will happen
            System.out.println("Please re-enter the number");// use this if you want person to enter another number
            num = input.nextInt();
        }

        String result = months[num-1];
            System.out.println(result);
        }



    }


