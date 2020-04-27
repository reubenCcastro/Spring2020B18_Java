package day20_ArrayCon;

public class MaxNumMinNum {
/*
Warmup tasks:
    1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
 */
    public static void main(String[] args) {

       // DataType[]  variableName = { dat1, data2, data3 };


            int [] num1 ={23, 65, 56, 34, 67, 87};
            int lastindex = num1.length-1;
            int maxNum = num1[0];
            int minNum = num1[0];
        for (int i = 0; i <= lastindex; i++){
            if(num1[i]>maxNum){// array's index are compared with each other, and whichever is greater will be assigned to the max
                maxNum=num1[i];
            }
            if(num1[i]<minNum){//array's index are compared with each other, and whichever is smaller will be assigned to the min
                minNum = num1[i];
            }

    }
        System.out.println("The max number is "+maxNum);
        System.out.println("The min number is "+minNum);







    }
}
