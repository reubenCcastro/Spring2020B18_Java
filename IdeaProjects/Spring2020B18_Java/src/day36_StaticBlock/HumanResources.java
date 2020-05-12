package day36_StaticBlock;

import Office_Hours.Practice_05_06_2020.Developers;

public class HumanResources {
                // since they're static I can call them through the class name into another class
    static Developers developers1;
    static Developers developers2 = new Developers();
    static Developers developers3 = new Developers();
    static Developers developers4 = new Developers();
    static Developers developers5 = new Developers();

                /*
                // here's my main method
                // if I set the dev1 info here after running the main method==> I can not use them outside this class
                public static void main(String[] args) {
                developers1.setDeveloperInfo("Reuben", 123, "SDET", 100000);

                */
                // but if I declare static block then initialize info for dev1 --> I will be able to call it outside this class
                // all static are loaded once the class is loaded
                // as soon as class is loaded, all the info are loaded
    static{ // once you put static it will run the Class and it will print in the CapitolOne class
        developers1 = new Developers();
        developers1.setDeveloperInfo("Reuben", 123, "SDET", 100000);
        developers2 = new Developers();
        developers2.setDeveloperInfo("Karolina", 1677, "SDET",100000);
                // Now if we call dev1 info into another class, info will appear
                // whenever we have static variable we can always use static block to do/use it
                // if we hae a variable that can get us data from excel file ==> I can set it in static block ==> it will run once class is loaded

    }
}
