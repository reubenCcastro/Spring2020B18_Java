package day07_IfStatements;

public class MinNumber {
    /*
            3. write a java program that accepts three numbers and return the minimum number
            (assume that none of them are equal)
             */
    public static void main(String[] args) {
        double a = 100;
        double b= 99;
        double c= 300;

        boolean aMinimum = a < b && a <c; //if a is less than both b and c, then a is minimum
        boolean bMinimum = b < c && b <a; //if b is less than both a and c, then a is minimum
        boolean cMinimum = c < a && c <b; //if c is less than both a and b, then a is minimum

        if(aMinimum){
            System.out.println(a +" is the minimum number ");
        }
        if(bMinimum){
            System.out.println(b +" is minimum number");
        }
        if(cMinimum) {
            System.out.println(c + " is minimum number");
        }
    }
}
