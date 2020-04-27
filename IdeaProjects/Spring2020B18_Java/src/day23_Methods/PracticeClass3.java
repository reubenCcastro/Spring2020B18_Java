package day23_Methods;

import java.util.Scanner;

public class PracticeClass3 {
    /*
    warm up tasks:


	3. write a method called Calculation, that can accepts 3 parameters:
	 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be
		Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
	4. write a method called Grade, that can print out the grade based
	on the score of the student
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
		Ex:
			Grade(100); ==> A
			Grade(120); ==> Invalid
     */


    /*
    1. write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of km: ");
        double km= scan.nextDouble();
        KmToMiles(km);


    }
    public static void KmToMiles(double km) {

        double miles= km*0.612;
            System.out.println((int)km+" km will be: "+miles+" miles.");



    }
/*2. write a method called GalonsToLitters, that can convert gallons
     to litters
	 			   1 G = 3.75 L

 */

}


















