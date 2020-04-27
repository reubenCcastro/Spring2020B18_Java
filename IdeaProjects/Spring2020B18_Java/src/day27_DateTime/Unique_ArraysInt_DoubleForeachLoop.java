package day27_DateTime;

public class Unique_ArraysInt_DoubleForeachLoop {
/*
3. write a method that can print out the unique elements from
an int array

	Ex: {1,1,2,3,3} ==> 2
	{6,6,7,7,8,9} ==> 8 9
4. write a method that can print out the unique elements from
 a double array

Note: Apply method overloading
 */

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};//2
        //           0,1,2,3,4

        for (int each2 : arr) {
            //arr[0]==>1
            int count = 0;// this is finding the frequency with arr[0]
            for (int each : arr) {
                if (each == arr[each2]) {// this is finding the frequency with arr[0]
                    count++;
                }
            }


            if (count == 1) {
                System.out.println(arr[each2]);
            }

        }
        System.out.println("============================");
        int[]arr2 = {2,3,4,5,4,3,5,7,8,9} ;
        uniqueElements(arr2);

    }

    public static void uniqueElements(int[] arr) {
        for (int each2 : arr) {
            //arr[0]==>1
            int count = 0;// this is finding the frequency with arr[0]
            for (int each : arr) {
                if (each == arr[each2]) {// this is finding the frequency with arr[0]
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[each2]);

            }
        }
    }

    public static void uniqueElements(double[] arr) {
        for (double each2 : arr) {
            int count = 0;// this is finding the frequency with arr[0]
            for (double each : arr) {
                if (each == each2) {// this is finding the frequency with arr[0]
                    count++;
                }
            }
            if (count == 1) {
               System.out.println(each2);

            }
        }
    }
}
