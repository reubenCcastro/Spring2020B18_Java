package day32_Predicate_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

                            /*
                            1. write a program that can return the second maximum number from Arraylist
                            Ex: {1,2,3,4,5,6,7,8,8};
                          output: 7
                            2. write a program that can return the second minimum number from Arraylist
                             Ex: {1,1,2,3,4,5,6,7,8,8};
                              output: 2
                    */
public class Return2nd_MaxMin {
    public static void main(String[] args) {
                    /*
                     max(CollectionType)     : return the max object from collectiontype
                        min(CollectionType)     : return the min object from collectiontype
                    swap(CollectionType, index1, index2)    : swaps elements at the given indexes without adding or removing
                        list: {1,2,3,4,5,6}
                    Collections.swap(list, 1, 2); ==> list: {1,3,2,4,5,6}
                    replaceAll(CollectionType, oldValue, newValue)   : replaces old value by new values
                         list: {1,1,1,2,3,4,5}  // replace all 1 by 10
                     Collections.replaceAll(list, 1, 10); ==> list {10,10,10,2,3,4,5}
                        */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 8));
        System.out.println(numbers);      //  [1, 2, 3, 4, 5, 6, 7, 8, 8, 8]
        //second max:7
        //socond min:2
        Integer maxNum = Collections.max(numbers);
        System.out.println(maxNum);//8

        numbers.removeAll(Arrays.asList(maxNum));// remove 8 and prints below

        System.out.println(numbers);// [1, 1, 2, 3, 4, 5, 6, 7]
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);//7


        System.out.println("===============================================");
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 8));
        Integer minNum = Collections.min(numbers2);

        numbers2.removeAll(Arrays.asList(minNum));

        System.out.println(numbers2);
        int secondMin = Collections.min(numbers2);
        System.out.println(secondMin);

        System.out.println("===================================================");
        ArrayList<Integer>number3 = new ArrayList<>();
        number3.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(number3);

        Collections.swap(number3,0,4);

        System.out.println(number3);

        System.out.println("======================================================");

        ArrayList<String> names =  new ArrayList<>();
        names.addAll(Arrays.asList("Omer","Omer","Mary", "Sha", "Faith", "Omer")); //Irina
/*
        names.set(0, "Irina");
        names.set(1, "Irina");
        names.set(5, "Irina");

 */
Collections.replaceAll(names, "Omer", "Irina");
        System.out.println(names);

    }






}
