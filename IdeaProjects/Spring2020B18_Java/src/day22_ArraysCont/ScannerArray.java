package day22_ArraysCont;

import java.util.Arrays;
import java.util.Scanner;

/*
Task02:
 1. Write a program that will take five Strings and save them into
    an array called arr.
 2. use for each loop to print out the first three letter of each
    element of arr, one per line. You can assume that every element
    of arr is at least 3 letters long.
           Example:
                    arr -> ["apple", "banana"]
                    prints: app
                            ban
                            scanner, Arrays, for loop, for each loop
                            substring is the best to use for this task
 */
public class ScannerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// only need one scanner
        // so put outside the loop if we need to hava multiple scsnner put in loop

        String arr[] = new String [5];

        for(int i = 0; i <arr.length; i++){
           arr[i] = input.next();// 1. this metheds will take user input for five times
        }
        System.out.println(Arrays.toString(arr));

        for ( String each : arr  ) {// (variable for each element  : String  )
           String str =  each.substring(0,2+1);// if I want to get the first three letters only need
            System.out.print(str);
        }

}

}
