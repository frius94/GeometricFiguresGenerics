public class Rectangle extends Figure {
    private String name = "Rechteck";
    private double width;
    private double height;
    private double area;
    private double circumference;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }

    @Override
    public double calcCircumference() {
        return this.height * 2 + this.width * 2;
    }

    @Override
    public void print() {
        System.out.println("+-----------------------------------+\n" +
                "|                                   |\n" +
                "|                                   |\n" +
                "|                                   |\n" +
                "|                                   |\n" +
                "|                                   |\n" +
                "|                                   |\n" +
                "+-----------------------------------+\n");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
