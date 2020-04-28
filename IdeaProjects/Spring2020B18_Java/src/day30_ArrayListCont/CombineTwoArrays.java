package day30_ArrayListCont;

import java.util.ArrayList;

/*
WARMUP TASKS:
5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class CombineTwoArrays {

    public static void main(String[] args) {

        String[]arr1 = {"A", "B", "C"};
        String[]arr2 = {"D", "E", "F", "G"};

        ArrayList<String>list = new ArrayList<>();//{"A", "B", "C","D", "E", "F", "G"};

        for( int i = 0 ; i <arr1.length; i++){
            String eachElement = arr1[i];
            list.add(eachElement);//arr1[i];

        }

        for(String eachElemnt :arr2){
            list.add(eachElemnt);
        }

        System.out.println(list);
    }


}
