package day38_ConstructorsCont;
import java.util.Arrays;
import java.util.ArrayList;

public class Pizza {
/*
1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
			  	Add a constructor that can allow user to set the size and toppisngs of the pizza
 */
    String size; int topCheese; int topPepperoni;
    public Pizza (String size, int topCheese, int topPepperoni){
        this.size=size;
        this.topCheese=topCheese;
        this.topPepperoni=topPepperoni;
    }
    /*
    instance method:
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
     Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     */
    public double calCost(){
        double total=0;
        if (size.equalsIgnoreCase("Small")) total+=10;
        else if (size.equalsIgnoreCase("Medium")) total+=12;
        else if (size.equalsIgnoreCase("Large")) total+=14;
        total+=topCheese;
        total+=topPepperoni*1.5;
        return total;
    }
    public String toString (){
        return "Pizza size: "+size+", Cheese "+topCheese+", Pepperoni "+topPepperoni+", Your total: $"+calCost();
    }
}
/*
create a class called Order
			create five objects of the pizza
			create an arraylist of pizza and add those 5 objects into it
			calculate the total price of the order (use for each loop)
 */
class Order {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Small", 2, 3);
        Pizza pizza2 = new Pizza("Medium", 4, 5);
        Pizza pizza3 = new Pizza("Large", 6, 7);
        Pizza pizza4 = new Pizza("Medium", 4, 2);
        Pizza pizza5 = new Pizza("Large", 7, 4);
        ArrayList<Pizza> list = new ArrayList<>(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));
        double sum=0;
        for (Pizza each:list){
            System.out.println(each);
            System.out.println("=======================================================");
            sum+=each.calCost();
        }
        System.out.println("Total of pizzas: $" + sum);
    }
}
