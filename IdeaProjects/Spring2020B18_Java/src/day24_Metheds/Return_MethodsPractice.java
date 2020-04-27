package day24_Metheds;

import java.util.Arrays;

public class Return_MethodsPractice {// will return you a value
    public static void main(String[] args) {
        int[]arr ={9,8,7,100,200,50,50,40};

        int max = maxNumber(arr);

        System.out.println(max);

        int min = minNumber(arr);

        System.out.println(min);

    }
    public static int maxNumber(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int minNumber(int[]arr){
        Arrays.sort(arr);
        return arr[0];
    }


}
