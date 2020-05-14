package day39_AccessModifiers;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){
        this.brand = brand;
        //model = "Unknown";
        //year=0;
        //price=0;
    }
    public Car(String brand,String model){
        this(brand);
        this.model = model;
        year=0;
        price=0;
    }
    public Car(String brand,String model, int year){
        this(brand, model);
        this.year=year;
        price=0;
    }
    public Car(String brand,String model, int year, double price){
        this(brand, model, year);
        this.price=price;
    }
    //to print out the object
    public String toString(){
      return  "Year of this beauty is : "+year+", Brand:"+brand+" ,Model: "+model+", Price: $ "+price;
    }
}



class carObject{
    public static void main(String[] args) {
        Car car1= new Car("Honda", "Accord", 2020, 21000);
        System.out.println(car1);
    }

}
