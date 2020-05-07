package day34_CustomClass;
import java.util.ArrayList;
import java.util.Arrays;
public class dogOjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setDogInfo("Pit Bull", "Monster", 1, "White and Grey", "Beast Mode");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Neaploitan Mastiff", "Large", 5, "Black", "Chubby");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Maltese", "Small", 2, "White", "Biggy");

        Dog dog4 = new Dog();
        dog3.setDogInfo("pomeranian", "Small", 4, "White", "Ernie");
    /*
    dog1.Breed = "Pit Bull";
    dog1.Size = "Monster";
    dog1.Color = "White and Grey";
    dog1.Age = 1;
    dog1.Name = "Beast Mode";



        System.out.println(dog1.Breed);
        System.out.println(dog1.Size);
        System.out.println(dog1.Color);
        System.out.println(dog1.Age);
        System.out.println(dog1.Name);

     */
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("======================");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3));

        for (int i = 0; i < puppies.size(); i++) {
            Dog eachdog = puppies.get(i);
            System.out.println(eachdog);
        }
        System.out.println("========================");
        puppies.removeIf(p -> p.Age > 2);
        for (int i = 0; i < puppies.size(); i++) {
            Dog eachdog = puppies.get(i);
            System.out.println(eachdog);


        }
    }
}
