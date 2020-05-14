package Notes;

public class Square {
    //public static void main(String[] args) {

    // P=4a , a = side of square
    // A=a2

    double side;
    double PerimeterOfSquare;
    double AreaOfSquare;

    //double side = 7.5;
    //double PerimeterOfSquare = 4 * side;
    //double AreaOfSquare = side * side;

    //System.out.print("If the side of square equals: " + side+ ", then Perimeter is: " +PerimeterOfSquare);
    //System.out.print(", and Area is: "+AreaOfSquare);

    public Square(double side) {
        this.side = side;
        PerimeterOfSquare = 4 * side;
        AreaOfSquare = side * side;
    }
    public String toString() {
        return "If a square side is: " + side + ", then the perimeterOfSquare is: " + PerimeterOfSquare + "and the AreaOfSquare is:  " + AreaOfSquare;
    }
}
    class SquareObjects{

            public static void main(String[] args) {
                Square square1 = new Square(7.5);
                //System.out.println(square1.AreaOfSquare);
                //System.out.println(square1.PerimeterOfSquare);
                //System.out.println(square1.side);
                System.out.println(square1);
    }
}


