package day28_DateTimeCont;

import java.time.LocalDate;


/*
Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */
public class LocalDate_Pratice {

    public static void main(String[] args) {


        String[] friends = {"Simon", "Mike", "Tommy", "Alex", "Marco"};
        LocalDate SimonBirthday =LocalDate.of(1980, 10, 9);
        LocalDate MikeBirthday = LocalDate.of(1981, 9, 22);
        LocalDate TommyBirthday =LocalDate.of(1977, 12, 30);
        LocalDate AlexBirthday = LocalDate.of(1981, 5, 03);
        LocalDate MarcoBirthday =LocalDate.of(1981, 7, 12);

        LocalDate[]birthdays = {SimonBirthday, MikeBirthday, TommyBirthday, AlexBirthday, MarcoBirthday};

        for(int i=0; i <friends.length;i++){
            String name = friends[i];
            LocalDate bd = birthdays[i];// local dateneed to asign
            System.out.println(name+" 's birthday is "+bd);
        }


        /*
        int a =100;
        int b =200;
        int c =300;
        int d =400;
        int e =500;
        int[] arrry1 = {a,b,c,d,e};

         */


    }


    }

