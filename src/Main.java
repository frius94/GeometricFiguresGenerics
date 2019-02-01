import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Geometry> geometries = new ArrayList<>();
        int choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Was möchtest du erstellen?");
            System.out.println("1) Kreis");
            System.out.println("2) Gleichseitiges Dreieck");
            System.out.println("3) Hexagon");
            System.out.println("4) Oval");
            System.out.println("5) Rechtwinkliges Dreieck");
            System.out.println("6) Rechteck");
            System.out.println("7) Rhombus");
            System.out.println("8) Quadrat");
            System.out.println("0) Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Circle circle = new Circle(getData("Radius: "));
                    circle.printInformation();
                    geometries.add(circle);
                    break;
                case 2:
                    GleichseitigTriangle gt = new GleichseitigTriangle(getData("Laenge: "));
                    gt.printInformation();
                    geometries.add(gt);
                    break;
                case 3:
                    Hexagon hexagon = new Hexagon(new GleichseitigTriangle(getData("Laenge: ")));
                    hexagon.printInformation();
                    geometries.add(hexagon);
                    break;
                case 4:
                    Oval oval = new Oval(getData("Laenge: "), getData("Hoehe: "));
                    oval.printInformation();
                    geometries.add(oval);
                    break;
                case 5:
                    RechtwinkligTriangle rt = new RechtwinkligTriangle(getData("Laenge AC: "), getData("Laenge BC: "));
                    rt.printInformation();
                    geometries.add(rt);
                    break;
                case 6:
                    Rectangle rectangle = new Rectangle(getData("Breite: "), getData("Hoehe: "));
                    rectangle.printInformation();
                    geometries.add(rectangle);
                    break;
                case 7:
                    Rhombus rhombus = new Rhombus(new GleichseitigTriangle(getData("Laenge: ")));
                    rhombus.printInformation();
                    geometries.add(rhombus);
                    break;
                case 8:
                    Square square = new Square(getData("Laenge: "));
                    square.printInformation();
                    geometries.add(square);
                    break;
                default:
                    System.out.println("Ungueltige Auswahl.");
            }
        } while (choice != 0);
    }

    private static double getData(String prompt) {
        double d = 0;
        boolean isDouble;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(prompt);
            try {
                d = scanner.nextDouble();
                isDouble = true;
            } catch (Exception e) {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                isDouble = false;
                scanner.next();
            }
        } while (!isDouble);
        return d;
    }

}
