package day20_ArrayCon;

import java.util.Arrays;

public class StringCharMetheds {

    public static void main(String[] args) {

        String name = "Reuben";
                    // 012345

        char []characters = name.toCharArray();

        System.out.println(Arrays.toString(characters));

        //.toCharArray to take a string and print out by single character


        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean equalsStr = Arrays.equals(ch1, ch2);

        System.out.println(equalsStr); // str1 & str2 are build out of the same characters
    }




}
