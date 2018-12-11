public class Circle extends Figure {
    private String name = "Kreis";
    private double radius;
    private double area;
    private double circumference;

    public Circle(double radius) {
        this.radius = radius;
        this.area = this.calcArea();
        this.circumference = this.calcCircumference();
    }

    public double getRadius() {
        return radius;
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double calcCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void print() {
        System.out.println("\n" +
                "        *  *\n" +
                "     *        *\n" +
                "    *          *\n" +
                "    *          *\n" +
                "     *        *\n" +
                "        *  *\n" +
                "\n");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
