package day07_IfStatements;

public class MaxNumber {

    /*
2. write a java program that accepts three numbers and return the maximum number
        (assume that none of them are equal)
 */
    public static void main(String[] args) {
        double a = 100;
        double b= 200;
        double c= 300;

        boolean aGreater = a > b && a >c; //if a is greater than both b and c, then a is maximum
        boolean bGreater = b > c && b >a; //if b is greater than both a and c, then a is maximum
        boolean cGreater = c > a && c >b; //if c is greater than both a and b, then a is maximum

        if(aGreater){
            System.out.println(a +" is greater number ");
        }
        if(bGreater){
            System.out.println(b +" is greater number");
        }
        if(cGreater){
            System.out.println(c +" is greater number");
        }

    }
}
