import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Geometry> geometries = new ArrayList<>();

        Circle circle = new Circle(5);
        circle.print();

        GleichseitigTriangle gleichseitigTriangle = new GleichseitigTriangle(5);
        gleichseitigTriangle.print();

        Hexagon hexagon = new Hexagon(gleichseitigTriangle);
        hexagon.print();

        Oval oval = new Oval(10, 5);
        oval.print();

        RechtwinkligTriangle rechtwinkligTriangle = new RechtwinkligTriangle(10, 5);
        rechtwinkligTriangle.print();

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.print();

        Rhombus rhombus = new Rhombus(gleichseitigTriangle);
        rhombus.print();

        Square square = new Square(5);
        square.print();

        geometries.add(circle);
        geometries.add(gleichseitigTriangle);
        geometries.add(hexagon);
        geometries.add(oval);
        geometries.add(rechtwinkligTriangle);
        geometries.add(rectangle);
        geometries.add(rhombus);
        geometries.add(square);
        Collections.sort(geometries);

        for (Geometry geometry : geometries) {
            System.out.println(geometry.toString());
        }

    }
}
