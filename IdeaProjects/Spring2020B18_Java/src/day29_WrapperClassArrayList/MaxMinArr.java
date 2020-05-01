package day29_WrapperClassArrayList;


import java.util.Arrays;

public class MaxMinArr {
    public static void main(String[] args) {


    /*
    Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method
     */
    //String[] arr = {"1","2.5", "3", "3.5", "4.5"};
    double[] arr = {1,2.5,3,3.5,4.5};
        double max = Double.MIN_VALUE;//1
        double min = Double.MAX_VALUE;
        for (double each :arr) { //5, each 1,2.5,3,3.5,4.5
            if (each > max) {
                max = each;

            }
            System.out.println(max);

        }


        System.out.println("=====================================================");
        String[] arr1 = {"1","2.5", "3", "3.5", "4.5"};

        double max1 = Double.MIN_VALUE;//1

        for (String each :arr1){ //5, each 1,2.5,3,3.5,4.5
            double num = Double.valueOf(each);
            if(num > max1){
                max1 = num;

            }
        }
        System.out.println(max1);

        System.out.println("=====================================");

        String []arr2 = {"1","2.5", "3", "3.5", "4.5"};
        double[] numbers = new double[arr2.length];

        for(int i = 0; i < arr2.length;i++){
            numbers[i] = Double.parseDouble(arr2[i]);

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);



    }

}
