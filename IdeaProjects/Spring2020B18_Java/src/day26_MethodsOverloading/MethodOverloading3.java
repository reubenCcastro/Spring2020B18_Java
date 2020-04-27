package day26_MethodsOverloading;

public class MethodOverloading3 {
  /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
  public static void main(String[] args) {
      sum(12.2,12.3);
      sum(12.4,12);
      double num2 = sum(12.3,23.4,34.5);// if it returns you new to assign
      // a variable to it to make a print sout
      System.out.println(num2);

  }
  public static void sum(int a, int b){
      System.out.println(a+b);

  }

  public static void sum(double a, double b){
        System.out.println(a+b);
  }

  public static double sum(double a, double b, double c) { // is method
      // overloading, return type does not matter
     return  a + b + c;
  }
}
