package InterviewQuestions;

import Resources.Library;

public class StringFrequencyofCharacters {
    /*
    Write a return method that can find the frequency of characters

    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    solution 1:

     */

    public static void main(String[] args) {
        System.out.println(freq("AAABBCDD"));


    }

    public static String freq(String str) {

        String NonDup = " ";
// to serpate get the unique nuber
        for (int i = 0; i < str.length(); i++) {

            if (!NonDup.contains("" + str.charAt(i))) {
                NonDup += "" + str.charAt(i);
            }
        }
        String results = "";
// non duplicates to the duplicates and and count
        for (int j = 0; j < NonDup.length(); j++) {
            int count = 0;
// this is to count them all
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == NonDup.charAt(j)) {
                    count++;
                }
            }


            results += NonDup.charAt(j) + "" + count;

        }
        return results;
    }

}







