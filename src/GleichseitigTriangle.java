public class GleichseitigTriangle extends Figure{
    private String name = "Gleichseitiges Dreieck";
    private double length;
    private double area;
    private double circumference;

    public GleichseitigTriangle(double length) {
        this.length = length;
        this.area = this.calcArea();
        this.circumference = this.calcCircumference();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return (this.length / 4) * Math.sqrt(3);
    }

    @Override
    public double calcCircumference() {
        return 3 * this.length;
    }

    @Override
    public void print() {
        System.out.println("         /\\");
        System.out.println("        /  \\");
        System.out.println("       /    \\");
        System.out.println("      /      \\");
        System.out.println("     /        \\");
        System.out.println("    /          \\");
        System.out.println("   /            \\");
        System.out.println("  /              \\");
        System.out.println("  ----------------");
    }

    @Override
    public String toString() {
        return "GleichseitigTriangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
