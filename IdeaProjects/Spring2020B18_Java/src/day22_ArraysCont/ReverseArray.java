package day22_ArraysCont;

import java.util.Arrays;

/*
1. write a program that can reverse the array
 */
public class ReverseArray {
    public static void main(String[] args) {
        /*
        String sentence = "I love to eat pizza";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            String eachWords = words[i];
            System.out.print(eachWords + " ");

         */
        /*you can not used for each loop for this task
        */

        int[] arr = {1,2,3,4,5};

        for(int i = arr.length-1; i >= 0; i--){
         int eachNum =   arr[i];
            System.out.println(eachNum);
        }
        System.out.println("================================================================");
        //2. write a program that sort the array in descending order   [5,4,3,2,1]
        int[] RevArr = new int [arr.length];// [0,0,0,0,0]


        /*RevArr [0] = arr[4];
        you can do it this way but you can do a for loop this is the logic
        RevArr [1] = arr[3];
        RevArr [2] = arr[2];
        RevArr [3] = arr[1];
        RevArr [4] = arr[0];
        */
        int j = arr.length-1; // need to assign the j int because you want another value to chage the i
        for(int i = 0;  i < arr.length; i++){
            RevArr[i] = arr[j];
            //RevArr[i] = arr[arr.length-1-i]; another way but this is Muhtar way
            j--;
        }

        System.out.println(Arrays.toString(RevArr));



    }
}
