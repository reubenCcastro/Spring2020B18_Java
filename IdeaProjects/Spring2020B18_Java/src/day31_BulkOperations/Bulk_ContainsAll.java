package day31_BulkOperations;
import java.util.ArrayList;
import java.util.Arrays;
public class Bulk_ContainsAll {
    public static void main(String[] args) {
                        /*
                        Bulk Operations:
                          containAll(CollectionType):
                         addAll(CollectionType):
                         removeAll(CollectionType):
                          retainAll(CollectionType):
                        */
            ArrayList<Integer> list1 =  new ArrayList<>();
            list1.add(10);
            list1.add(20);
            list1.add(30);
            list1.add(40);//I want to identify if 10,20,60 are all contained in ArrayList ==> true otherwise false
            // instead of creating a boolean expression for each object to check whether it is contained or not==>
            // ==> we can use containAll() method: it accepts collections type which is like an ArrayList
            // from Arrays utility we call a method called asList() method instead of creating another ArrayList:
            // Arrays.asList(object, object, object,...); it can convert object array to the list
            list1.containsAll(Arrays.asList(10,20,60));
            // since we don't have all the objects in the ArrayList we have, the result will be false
            // if 10, 20, 60, 80, 100, 200 , 4000 if all objectsare exits in arraylist ==> true
            // otherwise==> false

            /*
                boolean r1 = list1.contains(10);
                boolean r2 = list1.contains(20);
                boolean r3 = list1.contains(60);
                boolean result = r1 == true && r2 == true && r3 == true;
            System.out.println(result);
             */

            boolean result2 =   list1.containsAll(  Arrays.asList(10, 20, 30)  );
            // CollectionType
            System.out.println(result2);

            Integer[] data = {10, 30, 40};// 10, 30, 40
            boolean result3 =  list1.containsAll( Arrays.asList(data)  );
            System.out.println(result3);

            boolean result4 = list1.containsAll(Arrays.asList(10,20,60));
            System.out.println(result4);     // false







    }

}
