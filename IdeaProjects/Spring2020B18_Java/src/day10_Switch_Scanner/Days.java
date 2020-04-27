package day10_Switch_Scanner;

public class Days {

/*
2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
 */


    public static void main(String[] args) {

        int day = 7;
        String DayOfTheWeek  = " ";

        if(day >= 1 && day <= 7){

            if(day ==1){
                DayOfTheWeek = "Monday";
            }else if(day ==2){
                DayOfTheWeek = "Tuesday";
            }else if(day ==3){
                DayOfTheWeek = "Wednesday";
            }else if(day ==4){
                DayOfTheWeek = "Thursday";
            }else if(day == 5){
                DayOfTheWeek = "Friday";
            }else if(day ==6){
                DayOfTheWeek = "Saturday";
            }else {
                DayOfTheWeek = "Sunday";
            }
        }else{
            DayOfTheWeek ="Invalid";
        }
        System.out.println(DayOfTheWeek);
        System.out.println("===================================");
        int day1 = 7;
        String DayOfTheWeek2 = " ";

        if(day1 >= 1 && day1 <=7);

            DayOfTheWeek2 =(day1==1) ? "Monday" : (day1==2) ? "Tuesday" : (day1==3) ? "Wednesday" : (day1==4) ? "Thursday"
                    : (day1==5) ? "Friday" : (day1==6) ? "Saturday" : (day1==7) ? "Sunday" : "Invalid";

        System.out.println(DayOfTheWeek2);
        System.out.println("==================================================");


        int day2= 7;
        String result3 = " ";

        if(day2 > 0 && day2 < 7 ){ // num can only be 1 ~ 7

            result3 = (day2==1)?"Monday" :(day2==2)? "Tuesday" :(day2==3)?"Wednesday" :(day2==4)?"Thursday":(day2==5)?"Friday"
                    :(day2==6)?"Saturday" : "Sunday" ;

        }else{
            result3 = "Invalid";
        }

        System.out.println(result3);






    }
}
