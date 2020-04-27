package day06_Shorthnd_LogicalOperator;

public class WarmUp {

    /*
    warm up task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
     */


    public static void main(String[] args) {
        double gallons = 5;
        double gallonsToLiters = gallons * 3.785;
        String result = (gallons + " gallons is equal to: " + gallonsToLiters + " liters. ");
        System.out.println(result);

        double liters1 = 20;
        double litersToGallons1 = liters1 / 3.78;
        String result2 = (liters1 + "liters is equal to " + litersToGallons1 + " gallons. " );
        System.out.println(result2);

              int a = 200; // 199
              int b = -a++ + - --a * a-- % 2;

        //    int b = -200 + -200  * 200 % 2
        //          = -200 +    -40000   % 2
        //          = -200 +         0 because there's no remainder
        //          = -200
        System.out.println(b);




            int x = 300;
            int y = 400;
            int z = x + y - x * y + x / y;

        //        = 300 + 400 - 300 * 400 + 300 / 400
        //          300 + 400 -    120000 +    0 (0.75 should be whole number cause its an INT)
        //              700   -    120000 + 0
        System.out.println(z);












    }

}
