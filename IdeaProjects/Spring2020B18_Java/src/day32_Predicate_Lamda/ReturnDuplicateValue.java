package day32_Predicate_Lamda;
/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
			1. Find the frequency of each element from index 0
			2. create a variable count
			3. need a loop for, for each
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ReturnDuplicateValue {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();


        for(int i = 0; i < list.size();i++) {
            //list.get(0);//===> "A"
            int count = 0;
            for (String each : list) {
                if (each.equals(list.get(i))) {
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(list.get(i))) {// if the frequency
                // is greater than 1 and if its not contained in duplicates yet, then
                // we will add the fr
                duplicates.add(list.get(i));

            }
        }
        System.out.println(duplicates);
        /*
        //list.get(0)===> "A"
        int count = 0;
        for (String each : list) {
            if (each.equals(list.get(i))) {
                    count++;
                }
            }
            if (count > 1) {
                duplicates.add(list.get(i));
                System.out.print(duplicates);

         */
            }


        }


