package day29_WrapperClassArrayList;
import Resources.Library;
import java.util.ArrayList;

public class List_Practice2 {

    /*1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
                Do not use any sorting
  */
    public static void main(String[] args) {

        //1. . create a list of Intergers
        ArrayList<Integer> list = new ArrayList<>();
        //2. add 5 Integers to it
        list.add(100);
        list.add(20);
        list.add(104);
        list.add(50);
        list.add(233);
        list.add(143);
        list.add(1000);


        // 1a. declare a variable
        //int maximum = Integer.MIN_VALUE;
        int maximum = list.get(0);
        // 1b. for loop
        for(int i = 0; i < list.size(); i++){// i:0,1,2,3,4,
            if(list.get(i) > maximum){
                maximum = list.get(i);
            }

        }
        System.out.println(maximum);
        int maximum2 = Integer.MIN_VALUE;
        for( Integer each :list) {// variable that represents   :any data collection
            if (each > maximum2) {
                maximum2 = each;
            }


        }
        System.out.println(maximum2);

        ArrayList<Integer>  list2 = new ArrayList<>();
        list2.add(5000);
        list2.add(200);
        list2.add(300);

       int maximum3 = Library.max(list2);
       System.out.println(maximum3);


    }


    public static int max(ArrayList<Integer> list){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){

            if(list.get(i) > maximum ){
                maximum = list.get(i);
            }

        }

        return maximum;
    }






}






