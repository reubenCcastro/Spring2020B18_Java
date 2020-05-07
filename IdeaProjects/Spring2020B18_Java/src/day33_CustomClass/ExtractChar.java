package day33_CustomClass;

import java.util.ArrayList;

/*
3. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA
 */
public class ExtractChar {

    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();
        

        ArrayList<Character> letterList = new ArrayList<>();
        ArrayList<Character> digitList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();

        for(char each : arr){
            if(Character.isLetter(each)){
                letterList.add(each);
            }else if(Character.isDigit(each)){
                digitList.add(each);
            }else{
                charList.add(each);
            }
        }
        System.out.println(letterList);
        System.out.println(digitList);
        System.out.println(charList);
    }

    }

