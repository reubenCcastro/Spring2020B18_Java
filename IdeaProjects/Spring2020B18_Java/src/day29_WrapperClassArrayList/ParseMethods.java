package day29_WrapperClassArrayList;

public class ParseMethods {

    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str);//123

        System.out.println(str+1);//123
        //               "123"+1===>"1231"
        System.out.println(a1+1);//123
        //                  123+1===>124

       byte b1 = Byte.parseByte(str);// byte = 123
        System.out.println(b1);

        Integer I1 = (int)Byte.parseByte(str);//AutoBoxing
        //Integer = (int)byte;
        //Integer = int;

        String str2 =  "10.5";

      float f1 =  Float.parseFloat(str2);//float 10.5
        System.out.println(f1+1);// its a number not a string because we converted it.

        double f2 = Double.parseDouble(str2);// return you double 10.5

        System.out.println(f2 +1);////13.5

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);//long 3147483647 ; can also be put in float and double
        // but will be a decimal number

        System.out.println(num1);//3147483647

        Long num2 = Long.parseLong(str3);//autoboxing

        System.out.println(num2+2);

        String result1= "true";


        boolean r1 = Boolean.parseBoolean(result1);
        System.out.println(!r1);

        String results2 = "faLsE";//"false"

        boolean r2 = Boolean.parseBoolean(results2);

        System.out.println(r2);













    }
}
