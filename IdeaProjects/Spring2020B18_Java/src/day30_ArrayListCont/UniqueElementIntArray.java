package day30_ArrayListCont;

import java.util.ArrayList;

/*
3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
 */
public class UniqueElementIntArray {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(6);



        ArrayList<Integer>unique = new ArrayList<>();
        for(int i = 0; i <list.size(); i++){

            int count = 0;

            for(Integer each : list){
                if(each == list.get(i)){
                    count++;
                }

            }
            if(count == 1){
                unique.add(list.get(i));
        }

        }
        System.out.println(list);
        System.out.println(unique);
    }
}
