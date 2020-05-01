package day32_Predicate_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReturnDuplicates2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();//[B,D]
        for (int i=0; i<list.size(); i++){
            int count = Collections.frequency(list, list.get(i));
            if(count>1&& !duplicates.contains(list.get(i))){
                duplicates.add(list.get(i));
            }
        }
        System.out.println(duplicates);
        /*
        for(String each : list) {
            int count = Collections.frequency(list, each);

            if(count>1){
                if(duplicates.contains(each)){
                    continue;
                }
                duplicates.add(each);

            }
        }
        System.out.println(duplicates);

            */
        /*
        int count = Collections.frequency(list, list.get(0));


        if(count>1){
            duplicates.add(list.get(0));

         */

        }


    }

