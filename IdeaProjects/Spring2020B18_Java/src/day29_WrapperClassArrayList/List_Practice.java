package day29_WrapperClassArrayList;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk");//size:1
        shoppingList.add("cheese");//size:2
        shoppingList.add("eggs");//size:3
        shoppingList.add("coffee");//size:4
        shoppingList.add("chicken");//size:5

        for (int i =0;i < shoppingList.size(); i++){// for loop
            System.out.println(shoppingList.get(i));
        }

        System.out.println(shoppingList);

        System.out.println(shoppingList.get(0));

        System.out.println("================================================================");

        for(String each :shoppingList){// for each loop
            System.out.println(each);
        }

        //size():
        int size = shoppingList.size();
        System.out.println(size);


        int lastIndex = shoppingList.size() -1;
        System.out.println(lastIndex);
    }
}
