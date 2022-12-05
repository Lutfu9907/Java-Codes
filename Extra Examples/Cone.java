public class Cone extends Shape3D{
    double r;
    double h;
    double l;

    public Cone(double r, double h) {
        super("Cone");
        this.r = r;
        this.h = h;
        this.l = Math.sqrt(r*r + h*h);
    }

    @Override
    public double calculateArea() {
        return Math.PI*r*(r+l);
    }

    @Override
    public String toString() {
        String st = name + " with Area: " + calculateArea() + " Volume: " + calculateVolume();
        return st;
    }

    @Override
    public double calculateVolume() {
        return Math.PI*r*r*h/3;
    }
}
