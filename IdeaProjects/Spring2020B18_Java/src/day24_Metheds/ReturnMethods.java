package day24_Metheds;

public class ReturnMethods {

    public static void maxNum(int a , int b) {
      if(a >= b) {   //void will not return you any data on executing the
                     // function
          System.out.println(a);
      }else{
              System.out.println(b);
      }
    }

    public static void main(String[] args) {
       // int  a = maxNum(10,20); can not do this
        int result = Addition(10,20);
        System.out.println(result);
        int result2 =  result + 2000;   // 5000

        System.out.println(result2); // 5000
    }

    public static int Addition(int a, int b) {
   //                 return
        //System.out.println(a+b);

        return a+b;
        //What the benefit : you can return something from the
        // method and make it reusable
    }
}
