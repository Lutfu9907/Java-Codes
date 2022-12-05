import java.util.ArrayList;

/*
Create an abstract class called Shape, it should have:
name(string) and abstract toString function.

Create an interfaces called PerimeterCalculation, it should have:
calculatePerimeter() : returns the perimeter of the shape as double

Create an interfaces called AreaCalculation, it should have:
calculateArea() : returns the area of the shape as double

Create an interfaces called VolumeCalculation, it should have:
calculateVolume() : returns the volume of the shape as double

Create an abstract class called Shape2D, it extends Shape and implements Perimeter and Area calculations

Create an abstract class called Shape3D, it extends Shape and implements Area and Volume calculations.

Create and implement Circle, Square, Cone, and Cube classes with necessary functions and inheritance.

Note: You can use Math library and look up formulas of shapes.

 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Shape2D> twoDimentionalShapes = new ArrayList<>();
        ArrayList<Shape3D> threeDimentionalShapes = new ArrayList<>();

        Shape2D square = new Square(4);
        Shape2D circle = new Circle(2.5);
        Shape3D cube = new Cube(5);
        Shape3D cone = new Cone(3,4);

        twoDimentionalShapes.add(square);
        twoDimentionalShapes.add(circle);

        System.out.println("2D Shape List");
        for (Shape2D s : twoDimentionalShapes) {
            System.out.println(s);
        }

        threeDimentionalShapes.add(cube);
        threeDimentionalShapes.add(cone);

        System.out.println("3D Shape List");
        for (Shape3D s : threeDimentionalShapes){
            System.out.println(s);
        }

        shapes.addAll(twoDimentionalShapes);
        shapes.addAll(threeDimentionalShapes);

        System.out.println("All Shapes List");
        for (Shape s : shapes){
            System.out.println(s);
        }
    }
}
