package day33_CustomClass;
                        // those are instance variables NOT local variables
public class Car {// you can store 100 of different variables
    String Brand;// this is not have a static
    String Model;
    int Year;
    String Color;


    public void start() { // dont give static because it belongs to the class
        //   we will call this method through each object car1 and then car2
        System.out.println(Brand+" is started");
    }
    public void drive(){// instance method ==> call through the object
        System.out.println("Driving "+Brand+" "+Model);
    }
    public void getCarinfo(){
        System.out.println(Year+" "+Brand+" "+Model+" "+Color);
    }
                            // after I pass those variable, I can assign them to each instance variable
    public void setCarInfo(String carBrand,String carModel, int carYear, String carColor ){
        Brand = carBrand;
        Model = carModel;
        Year = carYear;
        Color = carColor;
        // then whenever I call this action, I will have to provide these info, whenever
    }
    public String toString(){
        String result = Year+" "+Brand+" "+Model+" "+Color;
        return result;

    }


    public static void main(String[] args) {
    int a = 100;// local variable

    }
}
