package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MMMM_yyyy");
        /*
        DateTimeFormatter:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("")

         year: yy, yyyy
         Month: MM(number), MMM(three letters), MMMM(full name)
         days: dd
         days name: E(three letters), EEEE(full name)
         */
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date birthDay:mmm/Days/year
         */
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yyyy");

        LocalDate date2 = LocalDate.of(1981,04,17);
        String str1 = date2.format(dtf2);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));


    }
}
