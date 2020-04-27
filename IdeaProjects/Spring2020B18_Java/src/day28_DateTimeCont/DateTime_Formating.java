package day28_DateTimeCont;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formating {

    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println(datetime1);

        //Tue 12/25/2015 11:45 am

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");

        System.out.println(datetime1.format(dtf));

        String str = datetime1.format(dtf);
        System.out.println(str);
    }
}
