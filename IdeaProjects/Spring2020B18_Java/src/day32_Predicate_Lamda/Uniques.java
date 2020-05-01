package day32_Predicate_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {

    // write a program that can return the unique objects
    // from arraylist of characters
    public static void main(String[] args) {

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));

        System.out.println(charList);//[A, A, B, C, D, D]

        ArrayList<Character> results = new ArrayList<>();

        /*for(int i = 0; i < charList.size(); i++){

            int count = Collections.frequency(charList,charList.get(i));
            if(count == 1){
                results.add(charList.get(i));

            }
        }

         */
        for (Character each : charList) {

            int count = Collections.frequency(charList, each);
            if (count == 1) {
                results.add(each);
            }

            }
            System.out.println(results);

        }

    }

