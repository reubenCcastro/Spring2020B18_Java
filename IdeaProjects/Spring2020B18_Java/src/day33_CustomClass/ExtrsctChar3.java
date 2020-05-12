package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
/*
4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */
public class ExtrsctChar3 {
    // we will do it here without using a loop to extract
    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        Character[] ch = new Character[arr.length];
                 // this array has the capacity of containing all elements from char [] arr
                // I need to assign index 0 of arr[0] to index 0 of ch[0]

                // I will use a loop to assign each character to the array
        for (int i = 0; i < arr.length;i++){
            ch[i]= arr[i];
    }
        System.out.println(Arrays.toString(ch));
        ArrayList<Character> letterList = new ArrayList<>(Arrays.asList(ch));// here we added all characters to letters list
        letterList.removeIf(p -> !Character.isLetter(p));//==> if character is NOT letter == remove it from letters list
        System.out.println(letterList);  //  [A, B, C, D, E, F, G]

        ArrayList<Character> digitList = new ArrayList<>(Arrays.asList(ch));// here we added all characters to digits list
        digitList.removeIf(p -> !Character.isDigit(p));//==> if character is NOT digit == remove it from digits list
        System.out.println(digitList);//  [1, 2, 3, 4, 5, 6]

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(ch));// here we added all characters to specialChars list
                // since I stored all letters in the collection type letters list and stored all digits in the collections type digits list==>
                //==> I can use removeAll() method to remove them and I will be left with only the special characters
        charList.removeAll(letterList); // removes all letters from total list
        charList.removeAll(digitList);// removes all digits form total list
        System.out.println(charList);// [$, %, #, @, &, !]

        // or
        // specialChars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));
}
}

