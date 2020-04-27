package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMetheds {
    /*
    String Metheds:toCharArray(): returns char array
    split(str): plits
*/

    public static void main(String[] args) {
        String str = "Cybertek";
        char[] ch = str.toCharArray();
        System.out.println(str.length()==ch.length); //true
        System.out.println("========");
        /*
        str1 = "abc", str2="cab"

         */

        String str1 = "ABC";
        String str2 = "BAC";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("============================");

        String sentence = "I like to learn java";

            String[] word =  sentence.split(" ");

        System.out.println(Arrays.toString(word));

        int totalWords = word.length;
        System.out.println(totalWords);

        String result=" ";
        //  [I, like, to, learn, java
        for(int i = word.length-1; i>=0; i--){
            //System.out.println(word[i]+" ");
            result += word[i]+" ";

        }
        System.out.println(result.trim());









    }
}
