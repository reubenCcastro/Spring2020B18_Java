package day33_CustomClass;

public class carObjects {

    public static void main(String[] args) {
     Car   car1 = new Car();
    car1.Brand = "BMW";// this is how you initialized what to print
    car1.Model = "X5";
    car1.Year = 2020;
    car1.Color = "Black";

        System.out.println(car1.Brand);// null
        System.out.println(car1.Model);
        System.out.println(car1.Year);
        System.out.println(car1.Color);

        car1.start();
        car1.drive();
        car1.getCarinfo();

        System.out.println("===============================");
        Car car2 = new Car();//ever single object has the own attributes

        car2.Brand = "Audi";// this is how you initialized what to print
        car2.Model = "A8";
        car2.Year = 2020;
        car2.Color = "Black";


        System.out.println(car2.Brand);// null
        System.out.println(car2.Model);
        System.out.println(car2.Year);
        System.out.println(car2.Color);

        car2.start();
        car2.drive();
        car2.getCarinfo();
        System.out.println("=============================");
        Car car3 =  new Car();

        car3.Brand = "Merceds";
        car3.Model = " C Class";
        car3.Year = 2020;
        car3.Color = "Black";

        car3.getCarinfo();
        car3.start();
        car3.drive();
        System.out.println("===================");
        Car   car4 = new Car();
        car4.Brand = "Scion";// this is how you initialized what to print
        car4.Model = "TC";
        car4.Year = 2006;
        car4.Color = "Green";

        System.out.println(car4.Brand);// null
        System.out.println(car4.Model);
        System.out.println(car4.Year);
        System.out.println(car4.Color);

        car4.start();
        car4.drive();
        car4.getCarinfo();
        System.out.println("==========================");
        Car   car5 = new Car();
        car5.Brand = "Honda";// this is how you initialized what to print
        car5.Model = "Accord";
        car5.Year = 2014;
        car5.Color = "Silver";

        System.out.println(car5.Brand);// null
        System.out.println(car5.Model);
        System.out.println(car5.Year);
        System.out.println(car5.Color);

        car5.start();
        car5.drive();
        car5.getCarinfo();

        System.out.println("================================");
        String str ="A";
        String str2 ="B";

        String [] arr ={str,str2};

        Car[]cars = {car1, car2, car3, car4, car5};

        cars[0].getCarinfo();
        cars[1].getCarinfo();
        cars[2].getCarinfo();
        cars[3].getCarinfo();
        cars[4].getCarinfo();
        System.out.println("=================");
        for(Car each:cars){
            each.getCarinfo();
        }
        System.out.println("=============");
        for(int i = 0; i < cars.length ;i++){
            cars[i].getCarinfo();
        }

        /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each carinfo
         */



    }
}
