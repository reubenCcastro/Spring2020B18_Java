package day27_DateTime;

import java.util.Arrays;

/*
5. write an int[] return method that can sort an int array
in desending order
6. write a double[] return method that can sort a double
array in desending order
NOTE: MUST apply method overloading
7. write a char[] return method that can sort a char array in desending order
NOTE: MUST apply method overloading
 */
public class SortCharArrayDescendingOrder {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 6, 4, 7, 8};
        int[] result= descendingOrder(arr1);
        System.out.println(Arrays.toString((result)));
        double[] arr = {3.3, 5.3, 6.3, 4.5, 6.5, 7.9, 8.7};
        double[]result1 = descendingOrder(arr);
        System.out.println(Arrays.toString(result1));
        char [] arr2 = {'A','B','C', 'D', 'E'};
        char[]result2= descendingOrder(arr2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] descendingOrder(int[] arr1) {

        Arrays.sort(arr1);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr1.length];

        int j = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            RevArr[i] = arr1[j];
            j--;
        }

        return RevArr;

    }

    public static double[] descendingOrder(double[] arr) {

        Arrays.sort(arr);
        double[] RevArr1 = new double[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr1[i] = arr[j];
            j--;
        }
        return RevArr1;
    }

    public static char []descendingOrder(char[]arr2){
        Arrays.sort(arr2);
        char [] RevArr2 = new char[arr2.length];
        int j = arr2.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            RevArr2[i] = arr2[j];
            j--;
        }
        return RevArr2;
    }

    }











