package day24_Metheds;

import Resources.Library;


import java.util.Arrays;


public class test {

    public static void main(String[] args) {
        String str = "Reuben";

       String RevStr =  Library.Reverse(str);

       System.out.println(RevStr);

       int[]arr = {5,6,7,8985,5355,42};

       arr = Library.sortDesending(arr);

        System.out.println(Arrays.toString(arr));

    }



}
