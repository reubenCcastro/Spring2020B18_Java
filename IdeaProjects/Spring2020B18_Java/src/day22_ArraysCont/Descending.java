package day22_ArraysCont;

import java.util.Arrays;

public class Descending {
    /*
    warmup tasks:

        4. write a program that can count the even and odd number from an array of integers
                            MUST use for each loop
                            1.approach of this is sorting methed first to ascending
                            2. then reverse the array.
     */
    public static void main(String[] args) {

        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr); // sorts the array in acending order

        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length];

        int j = arr.length - 1; // need to assign the j int because you want another value to chage the i
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            //RevArr[i] = arr[arr.length-1-i]; another way but this is Muhtar way
            j--;
        }
        System.out.println(Arrays.toString(RevArr));

    }
}


