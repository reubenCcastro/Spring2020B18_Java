package day26_MethodsOverloading;

public class MethodOverloading4 {


        public static void main(String[] args) {//You can overload the
            // main method but it will only print out String because its the original main method
            System.out.println("String");
        }
        public static void main(double[] args) {
            System.out.println("Double");
        }
        public static void main(int[] args) {
            System.out.println("Int");
        }

    }
