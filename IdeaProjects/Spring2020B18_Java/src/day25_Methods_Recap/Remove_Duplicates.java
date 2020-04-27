package day25_Methods_Recap;

public class Remove_Duplicates {

    public static void main(String[] args) {
        String str = "ABAB";
        String result = ""; //AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//B
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }

        System.out.println(result);

        String str2 = "ABCABCABC";
        String results2 = RemoveDuplicates(str2);
        System.out.println(results2);
    }

    public static String RemoveDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//B
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }

            return result;
        }

    }