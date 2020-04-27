package day20_ArrayCon;



public class Array_Size {

    public static void main(String[] args) {

        int[]arr1={1,2,3};
        //         0,1,2  index number
        // 1. System.out.println(arr1[100]); // arrays size fixed
            // this is the results if number is more than the arr1 2. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
        //	at day20_ArraysCont.Array_Size.main(Array_Size.java:11)

        int []nums = new int[2]; // {0,0};
        nums[0]= 10;
        nums[1]= 20;
        // nums[2]= 30; arrays size is fixed

        System.out.println(nums[0]);// 10
        System.out.println(nums[1]);// 20

        nums = new int[3];  // when you put new it reset the nums to 0
        System.out.println(nums[0]);// 0
        System.out.println(nums[1]);// 0

    }

}
