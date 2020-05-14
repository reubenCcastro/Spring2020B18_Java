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
    // These are our instance variables
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;
    // This is our Constructor that can initialize our instance variables like this:
    // The name of our Constructor method MUST match our class name
    // we provide the AccessModifier(here public) then name then we pass parameters if we need to (here we need 4 arguments)
    public SalaryCalculator(double hourlyRate,int weeklyHours, double stateTaxRate, double federalTaxRate){
        // then we assign our instance variable to the values we are passing in argument
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        // This constructor method will run every time I create an object
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
    // toString() method to specify how we want salary info printed:
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
