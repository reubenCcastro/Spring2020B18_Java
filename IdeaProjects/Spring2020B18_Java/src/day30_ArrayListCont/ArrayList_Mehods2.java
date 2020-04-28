package day30_ArrayListCont;

import java.util.ArrayList;

public class ArrayList_Mehods2 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        //list.remove(1);
        String str = "F";
        boolean  r1 =  list.remove(str);//false
        boolean r2 = list.remove("A");// true
        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer>list2 = new ArrayList<>();

        list2.add(1);//0
        list2.add(1);//1
        list2.add(2);//2
        list2.add(3);//2

        int num1 = list2.indexOf(1);
        //Integer =int  // Autoboxing

        System.out.println(num1);

        int num2 = list2.indexOf(100);//if this is giving you a negitive number than
        // you can say it does not existes

        System.out.println(num2);//it give you a negitive number

        int num3 = list2.indexOf(3);
        System.out.println(num3);


    }
}
