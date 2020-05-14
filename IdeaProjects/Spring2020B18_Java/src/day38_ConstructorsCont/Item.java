package day38_ConstructorsCont;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task04:
	create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class Item {
    //instance variable
    String name;
    double unitPrice;
    int quantity;
    //Constructor: to initialize instance variables
    // since we have 3 instance variables ==> we will pass 3 variables in the parameter
    public Item(String name, double unitPrice, int quantity ){
        // because names of instance variables = names of variables in my arguments ==> use this. to refer to instance variables
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        // now by doing this: once we create our objects using the Constructor: we will initialize the instance variables of each object
    }
    // instance method: to calculate cost
    // We can not make this method static because we need to use our instance variables here
    // we use Instance method to use Instance variables like this:
    public double calcCost(){
        return unitPrice*quantity;
        // instance means every single object has its own copy
        // each object will return different value from this method (it will return its own copy depending on its price and quantity)
    }
    public String toString(){// instance method : toString() to specify how we want to print our item information
        return "Name: "+name+", Unit Price: "+unitPrice+", Quantity: "+quantity+" Total Price: $"+calcCost();
    }
}
//syntax of creating an object new key word and the existing constructor which is Item in this example
class ShoppingList{
    public static void main(String[] args) {
        // when creating objects we must pass our argument in the parameter because that's how we created our constructor
        Item item1 = new Item("soda", 1,6);
        Item item2 = new Item("milk", 3,1);
        Item item3 = new Item("eggs", 4,1);
        Item item4 = new Item("beef", 10,1);
        Item item5 = new Item("chicken",6,1);
        // to try if our constructor works we can try printing one item like this:
        System.out.println(item1.calcCost());//6.0 this print makes sure
        System.out.println(item1);//Name: soda, Unit Price: 1.0, Quantity: 6 Total Price: $6.0

        //To calculate the total cost of all items purchased I will add items into a list then use for each loop
        // using the loop I will also print out each item details first then calculate the total:
        ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        //or this waylist.addAll(Arrays.asList(item1,item2,item3,item4,item5));
        double totalCost = 0; // we want to add all the total cost of all items
        // we can apply a loop to get total prices
        //solution 1
        //data type:collection of data
        for (Item each:list) {//forneach loop
            totalCost += each.calcCost();
            System.out.println(each);
        }

        for(int i = 0; i < list.size();i++){//regular loop
            totalCost += list.get(i).calcCost();

        }
        System.out.println("Total price of shopping list: $"+totalCost);
        }

    }

