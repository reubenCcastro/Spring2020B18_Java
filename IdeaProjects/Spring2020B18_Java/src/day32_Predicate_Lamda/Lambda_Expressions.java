package day32_Predicate_Lamda;


import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {

    public static void main(String[] args) {
         /*
        Predicate: can be applied to any collection Type, we have learn ArrayList so far (as a collectionType)
        Predicate<Integer> oddNumber = p -> p % 2 != 0
        // p represents the Integer
        // -> is mandatory
         */
        // we want to remove all odd numbers

        // first we create a Predicate called oddNumber
        // second we use list.removeIf(Predicate) method and use the one we created
        // list.removeIf() : removes every single object from list with the expression of the predicate
        // removeIf() method only accepts Predicate
        Predicate<Integer> oddNumber = x -> x%2 != 0; //  x : stands for our Integer

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // removeIf() method only accepts Predicate
        list.removeIf(oddNumber);  // removed odd numbers from list

        System.out.println(list); //  [2, 4, 6, 8, 10]

        System.out.println("=====================================");
                // create a method to remove all numbers less than 5
                // first we create our Predicate:
        Predicate<Integer> lessThan5 = Y -> Y < 5; // y: stand for our Integer
        ArrayList<Integer> list2 = new ArrayList<>();
        // If I have to apply to some data structure such as collection
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // If I want to remove all numbers in this list that are less than 5 ==> use removeIf()
        // removeIf() method only accepts Predicate
        list2.removeIf(lessThan5);//  removed all numbers that are less than 5
        System.out.println(list2);//[5, 6, 7, 8, 9, 10]

        System.out.println("===============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Reuben", "Castro","Mayito","Karolina", "Junior"));
        System.out.println(names);
        // remove all names that start with M
        // first we create a Predicate called startsWithM
        // then we use removeIf() method
        // Type of Predicate must be String
        Predicate<String> startsWithM = s -> s.startsWith("M");// !s -> s.startsWith("M");
        // OR
        //  Predicate<String> startsWithr = s -> !s.startsWith("r"); // if we want to remove what doesnt' start with r
        // Predicate<String> startsWithr = s -> s.toLowerCase().startsWith("r"); // to ignore case sensitivity
        names.removeIf(startsWithM);
        System.out.println(names);

        System.out.println("======================================================");




        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Reuben", "Castro","Mayito","Karolina", "Junior"));
        System.out.println(names2);
                 // if name starts with r or a, remove name from list
        Predicate<String> startsWithM_K = each -> each.startsWith("M") || each.startsWith("K");// !s -> s.startsWith("M");
        names2.removeIf(startsWithM_K);// to remove all names that start with M or with K
        System.out.println(names2);


        System.out.println(names2);

        System.out.println("===================================");

                // c >= 48 && c <= 57;


        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll( Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
                // we want to remove all the digits from this list
                // we can create a Predicate for digits
                // Hint: digits start from 48 - 57 on ascci table
        Predicate<Character> digits = c -> Character.isDigit(c);// all elements that represent digits will be removed
        //Predicate<Character> digits = c -> c >=48 && c<=57 ;
        // now we can call this methodchars.removeIf(digits);

        System.out.println(chars); //  [a, b, @, &, z]


        System.out.println("=================================");
        // I want to remove all numbers > 5
        // I can create Predicate
        // I can pass it itself without declaring
        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf( p -> p > 5);  // p represents our Integer. Any nubmer > 5 are removed


        System.out.println(nums);//   [1, 2, 3, 4, 5]


    }
}
