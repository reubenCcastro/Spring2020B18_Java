package day07_IfStatements;

public class If_Else_Statment {

    public static void main(String[] args) {

        int number =5;
        if (number >= 2) {
            System.out.println(number +" is positve");
        }
        if(number < 2){
            System.out.println(number +" is negitive");
        }

        if(number >= 2){

            System.out.println(number +" is positve");
        } else{
            System.out.println(number +" is negitive");
        }

        int age = 20;
        if (age >= 21){
            System.out.println("Here is your vodka");
        }
        else{
            System.out.println("Go home kid");
        }

        boolean testPositiveForCorona = false;

        if(testPositiveForCorona){
            System.out.println("Buy more toilet paper and stay home");
        }
        else{
            System.out.println("Do more coding");
        }


    }
}
