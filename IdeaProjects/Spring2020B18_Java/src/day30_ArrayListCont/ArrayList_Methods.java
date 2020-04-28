package day30_ArrayListCont;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();

        list1.add(5);
        list1.add(7);
        list1.add(8);

        list1.add(1,6);
        list1.set(3,9);// set  it replaces the number in that index
        //list1.add(7,10);index out of bound because there are only three indexes
        System.out.println(list1);


        int[]arr = {1,2,3,4};//{1,2,3,4,5}
        arr[3] = 5;   // {1,2,3,4,5}

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); // {A}
        list2.add("B");  //{A, B}
        list2.add(1, "C"); // {A, C, B}
        list2.add(1, "D");  // {A, D, C, B}

        list2.set(3, "F"); // {A, D, C, F}

        list2.set(2,  "E"); // {A, D, E, F}

        System.out.println(list2);   // {A, D, E, F}


        System.out.println("===============================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); // 0
        list3.add(2); // 1
        list3.add(3); // 2
        list3.add(4); //3

        int a = 3;// letter a is a primitive
        list3.remove(a);// index int number will be removed
        System.out.println(list3);

        Integer b = 1;// letter b is an object
        list3.remove(b);

        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);


        //list4.remove(1);
          Integer a2 =20;//passing the object
        boolean r1 = list4.remove(a2);
        System.out.println(list4);
        System.out.println(r1);


    }
}
