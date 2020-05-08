package day36_StaticBlock;

public class CapitalOne {

    public static void main(String[] args) {

        HumanResources.developers1.setDeveloperInfo("Reueben", 123,"Senior SDET",120000);// If you want to update the info you can
        System.out.println(HumanResources.developers1);
        System.out.println(HumanResources.developers2);
    }
}
