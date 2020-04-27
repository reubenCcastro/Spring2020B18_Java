package day28_DateTimeCont;


import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();// when you need to have a screen shot
        // and need time and date this is usefull

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(15,30,45);

        System.out.println(time2);


    }
}
