package day12_JavaRecep;
import java.util.Scanner;

/*1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle


    */
public class Circle_Practice {

    public static void main(String[] args) {

        /*
        double pi = 3.14;
        double radius = 5.5;
        double area = pi *(radius * radius);
        double parameter = pi *(2*(radius * radius));
        System.out.println(area);
        System.out.println(parameter);
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double pi = 3.14;
        double radius = input.nextDouble();
        double areaOfCircle = pi *(radius * radius);
        double parameterOfCircle = pi *(2*(radius * radius));
        System.out.println("The area of a circle is: " +areaOfCircle);
        System.out.println("The parameter of a circle is: "+parameterOfCircle);





    }


}
