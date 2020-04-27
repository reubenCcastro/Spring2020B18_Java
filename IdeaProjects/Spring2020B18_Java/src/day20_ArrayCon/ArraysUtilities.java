package day20_ArrayCon;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {
        int[]arr = {1,2,3};

        String r = Arrays.toString(arr);// only needed to print a Array
        System.out.println(r);

        System.out.println(arr);// Array must be converted to string before we print

        String names[] = {"Castro", " Reuben", "Cliff"};
        System.out.println(Arrays.toString(names));


        double[] nums ={10,20,30,40,50};
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]+1);// if you want to add 1 so it will be 11.0 because the first number
                                      //  is 10

    }



}
