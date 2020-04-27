package day23_Methods;

public class UniqueValuesForEachLoop {

    public static void main(String[] args) {

/*
        warmup task:
        1.  Write a program that can print out the unique values from a String Array
        Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output:  A
                C
        MUST use for each loop

        how many time this one element are in this program

*/

        String[] arr = {"A", "A", "B", "C", "D", "D"};
        //regular for loop

        for(int j =0; j <arr.length;j++) {
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    count2++;
                }

            }

            if (count2 == 1) {

                System.out.println(arr[j]);
            }

        }


        System.out.println("===========================================================");
        //Solution 2

        for (String each2 : arr) {

            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }

            }
            if (count == 1) {

                System.out.println(each2);

            }

        }

    }
}







