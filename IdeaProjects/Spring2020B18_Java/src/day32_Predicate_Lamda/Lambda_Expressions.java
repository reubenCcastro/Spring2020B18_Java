package day32_Predicate_Lamda;


import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {

    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x%2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("=====================================");

        Predicate<Integer> lessThan5 = Y -> Y < 5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);
        System.out.println(list2);

        System.out.println("===============================================");

        Predicate<String> startsWithM = s -> s.startsWith("M");// !s -> s.startsWith("M");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Reuben", "Castro","Mayito","Karolina", "Junior"));
        System.out.println(names);
        names.removeIf(startsWithM);


        System.out.println(names);

        System.out.println("======================================================");

        Predicate<String> startsWithM_C = each -> each.startsWith("M") || each.startsWith("K");// !s -> s.startsWith("M");


        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Reuben", "Castro","Mayito","Karolina", "Junior"));
        System.out.println(names2);
        names2.removeIf(startsWithM_C);


        System.out.println(names2);

        System.out.println("===================================");

        // c >= 48 && c <= 57;
        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll( Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));

        chars.removeIf(digits);

        System.out.println(chars);


        System.out.println("=================================");
        Predicate<Integer> greaterThan5 = p -> p > 5;
        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8,9));
        // nums.removeIf( p -> p > 5);
        nums.removeIf(greaterThan5);

        System.out.println(nums);


    }
}
