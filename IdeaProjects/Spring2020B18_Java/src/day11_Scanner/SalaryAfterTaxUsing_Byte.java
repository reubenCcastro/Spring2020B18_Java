package day11_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SalaryAfterTaxUsing_Byte {
    /*
    warmup task:

        2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Salary ");
        int salary = input.nextInt();

        System.out.println("Enter your state tax ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter your federal tax ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;

        // totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        // salaryAfterTax = salary - totalTax

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after taxes is: $"+salaryAfterTax);
        System.out.println("Total tax: $"+totalTax);



    }


}
