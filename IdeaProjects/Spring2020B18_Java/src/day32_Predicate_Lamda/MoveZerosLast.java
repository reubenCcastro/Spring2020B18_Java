package day32_Predicate_Lamda;


import java.util.ArrayList;
import java.util.Arrays;

/*
warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
1. need to addAll the Arrays.asList
2.count how many zero are in this Array List
3.
 */
public class MoveZerosLast {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0,0,0,0));

        System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0]

        int count = 0;
        for(Integer each : list){
            if(each == 0){// finding the frequency of the zeros
                count++;

            }
        }
        System.out.println(count);// 7 zero are in the ArrayList
        list.removeAll(Arrays.asList(0));//removed all the zeros from the list
        System.out.println(list);//[1, 2, 3, 4] after all zero are removed
        //
        for(int i = 0; i < count; i++){//this loop will add the count which is zero to the ArrayList
            list.add(0);//the zero will be added in the end
        }

        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0]
    }
}
