package Office_Hours.Practice_04_08_2020;

public class DoWhileLoop {

    public static void main(String[] args) {
      /* only know the function but don't use this way use the while or for loop

      do{

            statement;

      }while(condition);

      execution order:
      1. statement;
      2. condition
      if true: repeats step 1
      if false: stop the loop
       */

        boolean b = false;

        while (b) {
            System.out.println("Hello World");
        }

        System.out.println("========================================");

        do {
            System.out.println("Hello Cybertek");
        } while (b);

        System.out.println("=========================");


        int j = 0;

        do {

            if(j%15==0) {
                System.out.print(j + " ");
            }

            j++;
        } while (j <= 100);


    }

    }

