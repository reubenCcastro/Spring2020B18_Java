package day28_DateTimeCont;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formating {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time1 = LocalTime.of(5,30,22);

        System.out.println(time1.format(dtf));//if you need to format time1
        // you have to use DateTimeFormatter you need to add (time1.format(dtf)) to your print statement

        LocalTime time2 = LocalTime.of(10,0, 22);//by default it will be 16:30
        System.out.println(time2);

        boolean result1 = time1.isAfter(time2);
        System.out.println(result1);
    }
}
