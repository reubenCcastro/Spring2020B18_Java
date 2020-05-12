package day37_Contructors;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public Car(String brand,String model,int year, double price,String color){
        this.brand = brand;
        this.model = model;
        this.year =year;
        this.price = price;
        this.color = color;

    }

    public String toString(){
    return "The year of the car is: "+brand+" brand of the car is: "+brand+model+" $"+price;
    }
}
