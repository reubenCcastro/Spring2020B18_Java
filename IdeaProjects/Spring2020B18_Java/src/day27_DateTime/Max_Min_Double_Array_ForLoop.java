package day27_DateTime;

/*
2. write a method that can return the maximum number
from a double array
4. write a method that can return the minimum number
from a double array
NOTE: MUST apply method overloading
 */
public class Max_Min_Double_Array_ForLoop {//for loop
    public static void main(String[] args) {
        double[] arr = {3.3, 5.3, 6.3, 4.5,6.5, 7.9, 8.7};
        double max = Max(arr);
        double min = Min(arr);
        System.out.println("The maximum number of this Array is: "+max);
        System.out.println("The minimum number of this Array is: "+min);
    }
    public static double Max(double[] arr) {
        double max = -2000000000;
        for(int i = 0; i < arr.length; i++){
            double num = arr[i];
            if(num>max){
                max = num;
            }
        }
        return max;

    }

    public static double Min(double[] arr) {
        double min = 2000000000;
        for(int i = 0; i < arr.length; i++){
            double num = arr[i];
            if(min>num){
                min = num;
            }
        }
        return min;
    }


}