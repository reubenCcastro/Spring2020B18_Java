package day23_Methods;

/*
        step1: void method (without parameter)
        step2: void method(with parameter)
        step3: return method (without parameter)
        step4: return method (with parameter)
        step5: using the method different clases
        step6: overloading
            ...
 */


public class EvenNumbers {
    public static void main(String[] args) {

        oddNumber1_100();
        evenNumber1_100();
    }
        /*
    ask:
        1. write a method that can print all odd number between 1 ~ 100

     */

        public static void oddNumber1_100() {

            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i);

                }

            }
            System.out.println();
        }

                    /*
2. write a method that can print all even number between 1 ~ 100
 */
        public static void evenNumber1_100() {

            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);

                }


            }
            System.out.println();
        }

    }



