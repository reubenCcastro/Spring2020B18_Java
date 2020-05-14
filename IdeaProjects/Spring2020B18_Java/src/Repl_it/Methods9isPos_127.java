package Repl_it;

import java.util.Scanner;

/*
isPos is a method that checks if  an int positive or not positive

1. If  the int num is positive print positive else print not positive

2. Complete main method by calling isPos method for each element in the array arr.

 */
public class Methods9isPos_127 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }
        for (int each : arr) {
            isPos(each);
        }
    }

    public static void isPos(int num) {
        //#1 your code here
        if (num > 0) {
            System.out.println("positve");
        } else {
            System.out.println("not positve");
        }
    }
}


