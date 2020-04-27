package day27_DateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
Warmup task:
1. write a return method that can return the minimum number
from an int array

2. write a return method that can return the minimum number
from a double array


 */
public class Find_Minimum_ForeachLoop {//for each loop

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 4, 7, 8};

        int minimum = arr[0];

        for (int each : arr) {

            if (each < minimum) {
                minimum = each;

            }
        }
        System.out.println(minimum);

        int[] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};
        System.out.println(minimum(arr2));

        double[]arr3=  {-3.3, 5.3, 6.3, 4.5,-6.5, 7.9, 8.7};
        double num1 = minimum(arr3);
        System.out.println(num1);
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }

        }
        return minimum;
    }

    public static double minimum(double[] arr) {
        double minimum = arr[0];
        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}
