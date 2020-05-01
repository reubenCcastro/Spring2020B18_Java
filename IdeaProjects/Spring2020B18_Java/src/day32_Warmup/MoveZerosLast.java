package day32_Warmup;


import java.util.ArrayList;
import java.util.Arrays;

/*
warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists

 */
public class MoveZerosLast {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            result.add(list.get(i));
        }
        for(int i=0;i<4;i++) {
            result.add(0);
        }
        System.out.println(result);
    }

}
