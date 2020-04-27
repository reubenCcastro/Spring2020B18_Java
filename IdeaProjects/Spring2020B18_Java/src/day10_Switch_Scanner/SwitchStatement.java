package day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        /*
        float a1 = 4.5f; not accepted
        long a2 = 10l; not accepted
        double a3 = 2.5d; not accepted
        boolean a4 = true; not accepted

         */
        byte a = 4;
        switch(4){
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Invalid case");

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");
                break;


    }

    }
}
