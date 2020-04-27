package day12_JavaRecep;

import java.util.Scanner;

public class SalaryReport {

    /*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: $ ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter company name: ");
        String companyName = input.nextLine();

        System.out.println("Enter SSN: ");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter jobTitle");
        String jobTitle = input.nextLine();


        System.out.println("Full name is: " +fullName);
        System.out.println("Job Title is: " +jobTitle);
        System.out.println("Company name: "+companyName);
        System.out.println("SSN: " +SSN);
        System.out.println("Salary is: $"+ salary);







    }
}
