package day25_Methods_Recap;
import Resources.Library;// add this to add something from the resource file

public class Test {
    public static void main(String[] args) {
        String str = "ABCABCABCABCABCABC";
        String result = Library.RemoveDuplicates(str);// Do this step to use duplicates
        // from the duplicate class

        System.out.println(result);// then just print the result from the new string

        String str1 = "AABBCDEB";
        String str2 = "B";

        int num1 =  Library.Frequency(str1,str2);

        System.out.println(num1);

        String str3 = "mmmmsdsacxnsoichodcndasochoadhoosdsd";
        String results3 = Library.FrequencyOfChars(str3);
        System.out.println(results3);
    }

}
