package day24_Metheds;

public class CalculatorBirthYear {

    public static void Age(int birthYear){//

        int currentYear = 2020;

        int age = currentYear - birthYear;
        if(age >= 0 && birthYear > 1900){
            System.out.println(age);
        }else{
            System.out.println("You are not born yet");
        }

    }

    public static void main(String[] args) {
        int a = 2020;
        Age(a);
        printHelloCybertek();
    }

    public static void printHello(){

        System.out.println("Hello");

    }

    public static void printCybertek(){

        System.out.println("Cybertek");
    }
    public static void printHelloCybertek(){

        printHello();
        printCybertek();
    }
}
