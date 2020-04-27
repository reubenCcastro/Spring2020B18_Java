package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {

    public static void main(String[] args) {
        int a = 100;
        int[] arr = {100, 200, 300};
        //            0   1    2
        System.out.println(arr[1]);// prints out 200 because 1 == 200

        for (int i = 0; i < 3; i++) {// i: index of elements
            //             ;this is base on the int i = 0 (so
            //System.out.print(i+" "); //0, 1, 2 will be print out
            // cause that whats I equals
            int num = arr[i];
            System.out.println(num);
        }
        System.out.println("=======================================");

        int j = 0;
        while (j < 3) {
            int num = arr[j];
            System.out.println(num);
            j++;
        }
        System.out.println("======================");
        String[] names = {"John", "Aaron", "Luoise"};//3
        int length = names.length;
        String[] namesRev = new String[length];

        /* if you dont use Loop
        namesRev[0] = names[2];
        namesRev[1] = names[1];
        namesRev[2] = names[0];

 */

        /* this is the  for loop
        int k = length-1;
        for(int i = 0; i < length; i++){
            namesRev[i] = names[k];
            k--;
        }

 */
        /*
        the bottom one is for the while loop
         */

        int i = 0;
        int k = length-1;
        while(i<length){

            namesRev[i]= names[k];
            i++;
            k--;
        }

        System.out.println(Arrays.toString(namesRev));
    }
}

