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
    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        Character[] ch = new Character[arr.length];
        for (int i = 0; i < arr.length;i++){
            ch[i]= arr[i];
    }
        System.out.println(Arrays.toString(ch));
        ArrayList<Character> letterList = new ArrayList<>(Arrays.asList(ch));
        letterList.removeIf(p -> !Character.isLetter(p));
        System.out.println(letterList);

        ArrayList<Character> digitList = new ArrayList<>(Arrays.asList(ch));
        digitList.removeIf(p -> !Character.isDigit(p));
        System.out.println(digitList);

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(ch));
        charList.removeAll(letterList);
        charList.removeAll(digitList);
        System.out.println(charList);
}
}

