package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

/*
           create 5 car objects
           put them in an array of cars
           use for loop to get each car info
           use for each loop to get each carinfo
        */
                    // Car class is in the same package of this class that's why we don't call the import statement to import it.
public class carsObjects2 {
            // is it possible to assign Brand, Model, year, color automatically?
            // anyway that I create anthoer action that will let me assign all at once?? Yes..
            // I will create an action and call it setCarInfo
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
                // Can I store those car information in an array? yes I can
        Car [] cars = {car1, car2, car3};
                 // Can I loop through this array to use getCarInfo method? Yes I can:
        for(int i = 0; i < cars.length; i++){
                    // from this array cars[] , I will retrieve these cars one by one
            cars[i].getCarinfo(); // when i = 0 ==> get info will give info from car1.... etc
        }
        System.out.println("=================================");
                // can I apply for each
                 // what's the condition? we must have data structure.. what's our data structure here ? it is cars
                    // what's the type of each element in the array? it is Car
        for( Car eachCar  :cars){// eachCar: represents each element in array = object
                 // because eachCar is object ==> we can call getCarInfo:
            eachCar.getCarinfo();
        }
        System.out.println("==================================");
        System.out.println(car1);
                // when we create the object from array list like:
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
                // In java there's a special method called toString(); it gets executed automatically when wwe pass ojbect name into the print statement
        System.out.println(list1);
                // when we create a custom class, if I pass car1 in print statement? what should I see?
        System.out.println(car1);
                // If I want to see info about car1 , I have to pass this method toString().
                // I can go back to Car class and create a toString () method that will return me  a String like this
                // public String toString(){
                //   String result = year + " " + Brand" +" " + Model+ " " +color; // or switch order of printing
                //   return result;
                //  }

    }

}
