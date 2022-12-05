public class Cube extends Shape3D{

    double a;

    public Cube(double a) {
        super("Cube");
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 6*a*a;
    }

    @Override
    public String toString() {
        String st = name + " with Area: " + calculateArea() + " Volume: " + calculateVolume();
        return st;
    }

    @Override
    public double calculateVolume() {
        return a*a*a;
    }
}
