package day36_StaticBlock;
    // having multiple classes in the same java file is OK
    // if we want to have another class, it is totally fine
    // we can create as many classes as we want BUT there can only be one public class or it will give error
    // we have also to make sure that the public class name = file name (in our case her = MultiClasses)
    // on the left (the list of files) it will show an arrow next to our public class / file ==> when clicked it will show other names
    // we can have main method in each class we have here
    // to run a class we click on the green run play triangle next to class name
class Tester{ // AM: default
    public static void main(String[] args) {
        System.out.println("Tester");
    }
}
class Developers{ // AcessModifier: default
    public static void main(String[] args) {
        System.out.println("Developers");
    }

}

class ScrumTeam{ // AcessModifier: default
    public static void main(String[] args) {
        System.out.println("ScrumTeam");
    }

        }
public class MultiClasses { // AcessModifier: default
    public static void main(String[] args) {
        System.out.println("Multi-Class");
    }



}
