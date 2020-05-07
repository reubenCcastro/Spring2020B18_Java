package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

/*

            1. create an ArrayList of string called country names
            2. write a program that can remove all the country names that have length of 10 or greater

 */
public class WarmUp {

    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Afghanistan","Argentina","Australia", "Bangladesh", "Central African Republic", " Colombia"));
        Predicate<String> longNamed10 = l ->  l.length() >= 10;
        countryNames.removeIf(longNamed10);
        System.out.println(countryNames);


    }

}



