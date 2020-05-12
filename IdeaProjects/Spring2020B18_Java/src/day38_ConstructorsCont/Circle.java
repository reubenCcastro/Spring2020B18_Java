package day38_ConstructorsCont;

public class Circle {
    /* day12_JavaRecap
            Task02:
            Create a class called Circle
                instance variables:
            radius, pi, diameter
             add a constructor that can initialize the radius of the circle
            instance methods:
            area(): can return the area of the circle as double
            perimeter(): cna return the perimeter of the circle as double
            toString(): returns the info of the circle
            Note: global value of PI is 3.14
            diameter of circle = 2 * radius
            area of circle = PI * r * r
            */
    double radius;
    static double pi = 3.14;
    double diameter;

    public Circle(double radius) {

        this.radius = radius;
        diameter = radius * 2;

    }

    public double Area() {
        return pi * (radius * radius);
    }

    public double Perimeter() {
        return pi * (2 * (radius * radius));
    }

    public String toString() {
        return "Circles radius: "+radius+
                ", Circles diameter: "+diameter+
                ", Circles area: "+Area()+
                ", Circles perimeter: "+Perimeter();
    }
}
   class CircleObject{


    public static void main(String[] args) {
        Circle circle1 = new Circle(6.0);
        System.out.println(circle1.Area());//94.985
        System.out.println(circle1.Perimeter());//189.97
        System.out.println(circle1.diameter);//11.0
        System.out.println(circle1);

    }

    }

