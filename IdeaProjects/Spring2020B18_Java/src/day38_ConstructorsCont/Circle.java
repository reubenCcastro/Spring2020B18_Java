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
    double radius;// instance variable
    static double pi = 3.14;// static variable (one copy of this variable for ALL circles - our objects)
    double diameter;// instance variable
            // Here we will add a constructor that can initialize the radius of circle: we assign its value to our instance variable radius
    public Circle(double radius) {

        this.radius = radius;
        diameter = radius * 2;// no need for this. because it's the only variable with this name
             // diameter must be instance because each circle will have its own diameter depending on radius (which is instance)

    }
                // here I will create instance method to calculate area of circle like this:
    public double Area() {// must be instance method because we are using an instance variable in here
        return  pi * radius*radius; // even though we are using a static variable BUT we are also using an instance one ==> instance method

    }
                    // here I will create instance method to calculate perimeter of circle like this:
    public double Perimeter() {// must be instance method because we are using an instance variable in here
        return 2*radius*pi;  // even though we are using a static variable BUT we are also using an instance one ==> instance method
        //  return diameter*pi; //(because diameter = 2*radius)
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

