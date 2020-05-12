package day38_ConstructorsCont;
/*
Task03:
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): retuns the total state tax 6.25 TXas double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax 22.00 as double ( salary * fedralTaxRate)
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate,int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 48;
    }
    public double salaryAfterTax(){
        return  salary() - (stateTax() +  federalTax());
    }
    public double stateTax(){
        return stateTaxRate * salary();
    }
    public double federalTax(){
        return federalTaxRate * salary();
}
    public String toString (){
        return " The hourly rate: "+hourlyRate+
                "\n The weekly rate: "+weeklyHours+
                "\n Gross Salary is:  "+salary()+
                "\n State Tax: $"+stateTax()+
                "\nFederal Tax: $"+federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }
}
class SalaryObjects{
    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator(50,40,0.065, 0.022);
        System.out.println(salary1);

    }
}
