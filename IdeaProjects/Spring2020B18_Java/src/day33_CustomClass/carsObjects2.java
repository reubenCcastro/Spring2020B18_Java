package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

/*
           create 5 car objects
           put them in an array of cars
           use for loop to get each car info
           use for each loop to get each carinfo
        */
public class carsObjects2 {
    public static void main(String[] args) {

    Car car1 = new Car();
    car1.setCarInfo("BMW","X6", 2020, "Red");
    car1.getCarinfo();

    Car car2 = new Car();
    car2.setCarInfo("Honda", "Accord", 2014, "Silver");
    car2.getCarinfo();

    Car car3 = new Car();
    car3.setCarInfo("Scion","TC",2006, "Black");
    car3.getCarinfo();

        System.out.println("===================================");
        Car [] cars = {car1, car2, car3};

        for(int i = 0; i < cars.length; i++){
            cars[i].getCarinfo();
        }
        System.out.println("=================================");

        for( Car eachCar  :cars){
            eachCar.getCarinfo();
        }
        System.out.println("==================================");
        System.out.println(car1);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println( list1 );  // toString method gets executed automatically

    }

}
