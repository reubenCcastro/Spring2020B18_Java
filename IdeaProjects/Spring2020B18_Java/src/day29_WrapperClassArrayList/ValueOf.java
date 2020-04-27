package day29_WrapperClassArrayList;



import java.util.Arrays;

public class ValueOf {

    public static void main(String[] args) {

        String str = "123";
        Integer a = Integer.valueOf(str);//Integer, 123

        System.out.println(a);//123

       double b = Integer.valueOf(str);// unboxing
       // double = Integer

        System.out.println(b);// 123.0

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);
        // double = double // none

        double d2 = Double.valueOf(str2);//15.5
        //    double =       Double // unboxing

        System.out.println(d1);//15.5
        System.out.println(d2);//15.5

        System.out.println(d1 == d2);

        System.out.println("================================================");
        int z1 = 2000;
        //   Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1 ;


      /*
      "True"
      "FAlSe" ==> to boolean
      "1000000000.5" ==> to float
      "123456"  ==> to int
       */

      String r1 = "trUe";

      Boolean t1 = Boolean.valueOf(r1);// boolean, true
        //          Boolean = Boolean // none

      boolean t2 = Boolean.valueOf(r1);// boolean, true
        //          Boolean = Boolean // unboxing
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("===============================================");
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);//2147483647

        double maxNum2 = Double.MAX_VALUE;

        System.out.println(maxNum2);//1.7976931348623157E308

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);//-2147483648

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);//127

        byte minNum4 = Byte.MIN_VALUE;
        System.out.println(minNum4);//-128

        System.out.println("========================================");

        int[]arr = new int[3];
        System.out.println(Arrays.toString(arr));





    }
}
