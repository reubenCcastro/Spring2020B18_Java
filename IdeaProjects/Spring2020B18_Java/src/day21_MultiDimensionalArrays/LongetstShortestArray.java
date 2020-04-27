package day21_MultiDimensionalArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
2. write a program that can return the logest string of
	text from an array
	3. write a program that can return the shortest string
	of text from an array
 */
public class LongetstShortestArray {

    public static void main(String[] args) {

        String[] names = {"Reuben", "Castro", "Cliff", "Mayito", "December"};
        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longestWord = "";
        String shortestWord = "";

        for (int i = 1; i < names.length; i++) {

            if (names[i].length() > maxLengthString) {
                maxLengthString = names[i].length();
                longestWord = names[i];
            }

            if (names[i].length() < minLengthString) {
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
        }

                System.out.println("The longest word is: "+longestWord);
                System.out.println("The shortest word is: "+shortestWord);

        }
    }
