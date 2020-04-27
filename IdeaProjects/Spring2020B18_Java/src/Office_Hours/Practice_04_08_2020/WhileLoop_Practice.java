package Office_Hours.Practice_04_08_2020;

public class WhileLoop_Practice {

    public static void main(String[] args) {

        /*
        while(condition){
                statements
         }

         repeated if statement
         execution order:
                1. condition
                    if true: executes statements
                    if false: stops the loop

         */

        for (int i = 1; i < 5; i++){
            System.out.println(i);
        }

        System.out.println("=============");

        int z = 0;
        while(z<5){
            z++;
            System.out.println("Hello Cybertek"+z);

        }

        System.out.println("========================================");
        /*
        number that can be divided by 15
         */

        int j = 0;
        while (j <=100){
            if(j % 15 == 0)
            System.out.print(j+" ");// 0 ,15,30, 45,60, 75, 90

            j++;
        }
    }
}
