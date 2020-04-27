package day25_Methods_Recap;
import Resources.Library;
public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AABBCC";
        String NonDup = Library.RemoveDuplicates(str); // ABC

        String result= "";
        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//"A"
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }
        System.out.println(result);
    }

    public static String FrequencyOfChar(String str){

        String NonDup = Library.RemoveDuplicates(str); // ABC

        String result= "";// contains the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//"A"
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }
        return result;

    }
}


