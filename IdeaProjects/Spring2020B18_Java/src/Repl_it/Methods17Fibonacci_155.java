package Repl_it;

import java.util.Scanner;

/*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two
numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.
Input  : 2
Output : 1

Input  : 9
Output : 34
 */
public class Methods17Fibonacci_155 {
    public class Main {
    }
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            fib(num);
        }


    public static void fib(int num) {
        //WRITE YOUR CODE HERE
        int[] arr = new int[99999];

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            if (i == num) {
                System.out.println(arr[i]);
                break;

            }
        }

    }
}


