package day29_WrapperClassArrayList;

public class Auto_Unboxing {

    public static void main(String[] args) {

        int a =100;

        Integer b = a;//compiler goes through Auto boxing process
        //Autoboxing converts primitive into object
        //Both are done automatically
        System.out.println(b); //100

        Byte byte1 = 98;

        short  shor1 = byte1;//unboxing
        byte b2 = byte1;//unboxing
        int int1 = byte1;//unboxing
        //Unboxing converts object into primitive
        //Both are done automatically


    }
}
