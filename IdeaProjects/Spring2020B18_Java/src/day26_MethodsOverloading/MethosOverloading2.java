package day26_MethodsOverloading;
import java.util.Arrays;
public class MethosOverloading2 {


    public static void main(String[] args) {
        sum2Numbers(10,12);
        sum3Numbers(12,12,12);
        sum4Numbers(12,23,34,34);

        System.out.println("============================================================");

        sum(12,21,12,12);
        int [] arr1={3,2,1};
        char [] arr2={'z','s','a'};
        double [] arr3={7.4, 20.5, 6.5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

    }


    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    //=======================================================================================

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}
