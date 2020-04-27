package day08_IfStatements;

public class dayInAMonth {
    public static void main(String[] args) {
        /*
        2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
         */
        byte month = 12;

        boolean day28 = month ==2;
        boolean day30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean day31 = day28 == false && day30 == false;
        //boolean day31_2= !day28 && !day30;

        if(day28){
            System.out.println("It has 28 days");
        }
        if(day30){
            System.out.println("It has 30 days");
        }
        if(day31){
            System.out.println("It has 31 days");
        }












    }
}
