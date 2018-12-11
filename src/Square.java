public class Square extends Figure {
    private String name = "Quadrat";
    private double length;
    private double area;
    private double circumference;

    public Square(double length) {
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
        return this.length * this.length;
    }

    @Override
    public double calcCircumference() {
        return this.length * 4;
    }

    @Override
    public void print() {
        System.out.println("+---------------+\n" +
                "|               |\n" +
                "|               |\n" +
                "|               |\n" +
                "|               |\n" +
                "|               |\n" +
                "|               |\n" +
                "|               |\n" +
                "+---------------+\n");
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
