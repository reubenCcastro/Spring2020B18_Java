package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 30 +enter

        input.nextLine(); // enter

        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println("Your full name is: "+fullName);




    }
}
