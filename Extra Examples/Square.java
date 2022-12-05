public class Square extends Shape2D{

    double a;

    public Square(double a) {
        super("Square");
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public String toString() {
        String st = name + " with Perimeter: " + calculatePerimeter() + " Area: " + calculateArea();
        return st;
    }
}
