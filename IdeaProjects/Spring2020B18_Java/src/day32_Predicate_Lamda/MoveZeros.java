package day32_Predicate_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {
/*
    warmup tasks:
    Write a program that can move all the zeros to  last indexes of ArrayList
    Ex:
    list:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
    DO NOT USE SORT method, DO NOT declear  any extra lists

 */
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0,0,0,0));

    System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0]

    int count = Collections.frequency(list,0);
    System.out.println(count);//count is 7 zero

    list.removeAll(Arrays.asList(0));//removed all the zeros from the list
    System.out.println(list);//[1, 2, 3, 4] after all zero are removed
    for(int i = 0; i < count; i++){//this loop will add the count which is zero to the ArrayList
        list.add(0);//the zero will be added in the end
    }

    System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0]

}
}
