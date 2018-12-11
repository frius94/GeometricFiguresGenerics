public class Hexagon extends Figure {
    private String name = "Hexagon";
    private GleichseitigTriangle gleichseitigTriangle;
    private double area;
    private double circumference;

    public Hexagon(GleichseitigTriangle gleichseitigTriangle) {
        this.gleichseitigTriangle = gleichseitigTriangle;
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

    public GleichseitigTriangle getGleichseitigTriangle() {
        return gleichseitigTriangle;
    }

    public void setGleichseitigTriangle(GleichseitigTriangle gleichseitigTriangle) {
        this.gleichseitigTriangle = gleichseitigTriangle;
    }

    @Override
    public double calcArea() {
        return this.gleichseitigTriangle.calcArea() * 6;
    }

    @Override
    public double calcCircumference() {
        return this.gleichseitigTriangle.getLength() * 6;
    }

    @Override
    public void print() {
        System.out.println("       _____\n" +
                "      /     \\\n" +
                "     /       \\\n" +
                "    (         )     \n" +
                "     \\       /      \n" +
                "      \\_____/        \n");
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "name='" + name + '\'' +
                ", gleichseitigTriangle=" + gleichseitigTriangle +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}


