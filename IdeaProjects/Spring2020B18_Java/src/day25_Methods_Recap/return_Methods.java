package day25_Methods_Recap;

public class return_Methods {

    public static void main(String[] args) {
        System.out.println((max(10,9)));
        System.out.println((max2(9,10)));
    }

    public static int max(int a, int b) {

        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int max2(int a, int b) {
        if(a >=b){ // if true after return a it exits the statement
            return a;
        }else{
            return b; // b will only be returned if b is greater
        }


    }

}
