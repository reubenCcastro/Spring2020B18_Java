package day24_Metheds;

public class MaxNum {

    public static void main(String[] args) {
     /*
     1. write a methods that can return the maximum number between two
    numbers
    Ex: Max(10, 20) ==> 20
      */
        MaxNumber(10, 6);

    }

    public static void MaxNumber(int num, int num1) {

        if (num > num1) {
            System.out.println(num + " is greater number ");
        } else if (num1 > num) {
            System.out.println(num1 + " is greater number");
        } else {
            System.out.println("Number are equal");

        }
    }
}
