package day06_Shorthnd_LogicalOperator;

public class SingleIfStatment {
    public static void main(String[] args) {
        boolean coldWeather = true;

        if (coldWeather){
            System.out.println("wear jacket");
            System.out.println("wear gloves");

        }

        int a = 201;
        boolean evenNumber = a % 2 == 0;//if the number can be divided by 2 without the remainder
      //  boolean oddNumber = a % 2 != 0; // if the number cannot be divided by 2 evenly

        if (evenNumber ){
            System.out.println(a + " is even number");

            if (!evenNumber){ // if the  number is not even number, then it must be odd
                System.out.println(a +" is a odd number");
            }
        }
    }
}
