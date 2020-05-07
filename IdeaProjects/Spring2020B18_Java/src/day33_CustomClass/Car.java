package day33_CustomClass;

public class Car {// you can store 100 of different variables
    String Brand;// this is not have a static
    String Model;
    int Year;
    String Color;

    public void start() { // dont give static because it belongs to the class
        System.out.println(Brand+" is started");
    }
    public void drive(){
        System.out.println("Driving "+Brand+" "+Model);
    }
    public void getCarinfo(){
        System.out.println(Year+" "+Brand+" "+Model+" "+Color);
    }
    public void setCarInfo(String carBrand,String carModel, int carYear, String carColor ){
        Brand = carBrand;
        Model = carModel;
        Year = carYear;
        Color = carColor;
    }
    public String toString(){
        String result = Year+" "+Brand+" "+Model+" "+Color;
        return result;

    }


    public static void main(String[] args) {
    int a = 100;// local variable

    }
}
