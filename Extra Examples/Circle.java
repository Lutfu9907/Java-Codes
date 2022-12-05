public class Circle extends Shape2D{

    double r;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        String st = name + " with Perimeter: " + calculatePerimeter() + " Area: " + calculateArea();
        return st;
    }
}
