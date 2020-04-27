package day20_ArrayCon;
import java.util.Arrays;
/*
practice task:
    write a program that can combine two arrays of any lengths,
    and return the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7];
        arr3 ==> [1,2,3,4,5,6,7]
 */
public class Combine2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4, 5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; // can contain all the elements from array1 and array 2

        for(int i = 0; i <arr1.length ; i++ ){
            arr3[i] =  arr1[i];
        }

        for(int i= 0; i < arr2.length; i++ ){
            arr3[arr1.length+i]     =   arr2[i];
        }

        System.out.println( Arrays.toString(arr3)  );


      }




    }



