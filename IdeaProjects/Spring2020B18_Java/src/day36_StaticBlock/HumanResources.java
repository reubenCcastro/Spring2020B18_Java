package day36_StaticBlock;

import Office_Hours.Practice_05_06_2020.Developers;

public class HumanResources {

    static Developers developers1;
    static Developers developers2 = new Developers();
    static Developers developers3 = new Developers();
    static Developers developers4 = new Developers();
    static Developers developers5 = new Developers();

    /*this is not correct to print in the CapitolOne class it will be null
    public static void main(String[] args) {
        developers1.setDeveloperInfo("Reuben", 123, "SDET", 100000);

     */
    static{ // once you put static it will run the Class and it will print in the CapitolOne class
        developers1 = new Developers();
        developers1.setDeveloperInfo("Reuben", 123, "SDET", 100000);
        developers2 = new Developers();
        developers2.setDeveloperInfo("Karolina", 1677, "SDET",100000);


    }
}
