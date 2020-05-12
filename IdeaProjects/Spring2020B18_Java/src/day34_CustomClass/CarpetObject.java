package day34_CustomClass;

                            /*
                            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
                            create two ArrayList of carpets:
                             persianCarpets
                             reugularCarpets
                             write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                             use for each loop to print out all the persian carpets
                             */
import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {

    public static void main(String[] args) {
                            // what's an object? it's the instance of a class
                            // each object has its own instance variables
                            // instance means: feature .. situation
                            // in the class if you specify data attributes and methods, ==>
                            // when I create the object ==> I can use those data attributes and methods
                            // we create object by using "new" keyword from the class we have
                            // if i want to create an object from the custom class I have, can i use this new keyword? Yes I can:
                            //I want to put them in some kind of variable. what variable can I put them in? I can put them in Carpet Array
                            // I can initialize my objects like this: new Carpet() for first carpet, new Carpet() for second carpet
        Carpet[] carpets =  {new Carpet(), new Carpet(),  new Carpet(),  new Carpet(),  new Carpet()};
                            //System.out.println(carpets[0]);// when i pass the object of class in print statement it's giving me hashcode
                            // because compiler by default runs the toString method. but we have not specified it yet. we have to create it in Carpet class
                            // I need to cal customOrder() method first and provide values first then it will print
                            // how do I retrieve the first object? by giving the first index carpets[0], and calling the customOrder()method and provide values
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35, 45, 35, false);

                            // we are going to store the persian carpet objects. I can use arrayList with Carpet dataType==>
                            // in order to check how many persian carepts we have ( in case we don't know how many we have)
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        for(Carpet eachCarpet  : carpets){
            if(eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }
                            // to know how many there are ==> we need to return the length of the ArrayList ==> persianCarpets.size():
        System.out.println("there are "+persianCarpets.size()+" persian carpets");
                            // how do I retrieve first object from ArrayList and print it out? I use .get() method
                            // can I print it directly? yes I can because it returns me an object
        System.out.println(persianCarpets.get(0));
                            // if I want to only print the total price only? I can call calcCost() method
        System.out.println(    persianCarpets.get(0).calcCost()    );
        System.out.println(   persianCarpets.get(1).calcCost() );
                            // what if I want to return the budget of all the carpets? we get each one then add them together

                            // how can I get all the carpets that are not Persian? I create a new ArrayList to store them:
                            // how can I add all carpets first to this arrayList? use arrays.asList()method
                            // Then I will remove the persian ones. I have to pass an object ==> persianCarpets


        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
                            // regularCarpets.removeAll(persianCarpets); // I removed all persian==> left with regular
                            // I want to use the removeIf() like this with a predicate:
        //regularCarpets.removeAll(persianCarpets);same as removeIf
        regularCarpets.removeIf(p -> p.isPersian);// this removes carpets if persian
                            // How can I know how many carpets are regular? I just need to return this ArrayList size:
        System.out.println("There are "+regularCarpets.size()+" regular carpets");
                            // to get the price of first regular carpet I can call get() method and pass the index number 0
                            // then call calcCost() method:
        System.out.println(regularCarpets.get(0).calcCost());
                            //If I want to print all of the regular carpet prices==> I need to repeat the print statrement
                            // and change the index number 0-> 1-> 2..... etc
                            // I can use a loop like this:
        for(int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calcCost()  );
        }




    }


}
