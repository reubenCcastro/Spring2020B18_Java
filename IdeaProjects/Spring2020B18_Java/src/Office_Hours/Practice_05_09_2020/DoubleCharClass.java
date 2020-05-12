package Office_Hours.Practice_05_09_2020;
/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleCharClass {

    public String doubleChar(String str) {
        String word = "";
        for(int i=0; i < str.length(); i++) {
            //word += "" + str.charAt(i) + str.charAt(i);
            word += str.substring(i, i+1) + str.substring(i, i+1);

        }

        return word;

    }

}
