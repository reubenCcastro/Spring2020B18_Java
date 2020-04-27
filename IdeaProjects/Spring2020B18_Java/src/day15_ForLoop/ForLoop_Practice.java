package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        String result = " ";



    for (int number = 1; number<= 100; number += 2) {
        result += number+" ";
       // System.out.println(number+" ");
    }
        System.out.println(result);

        System.out.println("============================");
        String resultEven = " ";
        for (int number1 = 2; number1 <= 100; number1 +=2){
            //System.out.println(number1+" ");
            resultEven += number1+" ";
        }
        System.out.println(resultEven);
    }


}
