package day27_DateTime;

/*
warmup task:
1. write a method that can return the maximum number from an int array
3. write a method that can return the minimum number
from an int array

 */
public class Max_Min_Int_Array {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 6, 4, 7, 8};
        int max = Max(arr1);
        int min = Min(arr1);
        System.out.println("The maximum number of this Array is: " + max);
        System.out.println("The minimum number of this Array is: " + min);

    }

    public static int Max(int[] arr1) { //for loop
        int max = -200000000;
        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            if (num1 > max) {
                max = num1;
            }
        }
        return max;
    }

    public static int Min(int[] arr1) {
        int min = 200000000;
        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            if (min > num1) {
                min = num1;
            }
        }
        return min;
    }


}





