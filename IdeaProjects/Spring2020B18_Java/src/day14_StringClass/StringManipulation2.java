package day14_StringClass;

public class StringManipulation2 {

    public static void main(String[] args) {

        String str =" ";

        boolean bool1 = str.isEmpty();// true if there nothing in side the string
        System.out.println(bool1);

        String username = "";

        System.out.println("please provide the user first");

        String s1 = "Cat";
        String s2 = new String("Cat");

        System.out.println(s1 == s2); // false, different memory

        System.out.println(   s1.equals(s2)  );// true

        String z1 = "Tiger";

        String z2 = new String("Tiger");
        String z3 = "Tiger";
        String z4 = "tiger";
        // ==
        System.out.println( z1 == z2 ); // false
        System.out.println(z2 == z3);  // false
        System.out.println( z1 == z3 ); // true, same object

        // equals():
        System.out.println( z1.equals(z2)  );   // true
        System.out.println( z2.equals(z3) );    // true
        System.out.println(z1.equals(z3));  // true
        System.out.println(z3.equals(z4)); // false







    }





}
