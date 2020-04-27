package day21_MultiDimensionalArrays;
/*
warmup tasks:
	1. write a program that can return the average number
	from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10

 */
public class AverageNumber {

    public static void main(String[] args) {

        int [] arr={4,5,6,7,8, 10,20,30,0};
        int avg= 0;
        int total = 0;

        for (int i = 0; i < arr.length;i++){
            total += arr[i];
        }
        avg = total/arr.length;

        System.out.println(avg);


    }


}
