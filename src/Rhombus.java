public class Rhombus extends Figure {
    private String name = "Rhombus";
    private GleichseitigTriangle gleichseitigTriangle;
    private double area;
    private double circumference;

    public Rhombus(GleichseitigTriangle gleichseitigTriangle) {
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
        return this.gleichseitigTriangle.calcArea() * 2;
    }

    @Override
    public double calcCircumference() {
        return this.gleichseitigTriangle.getLength() * 4;
    }

    @Override
    public void print() {
        System.out.println("                 XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "                XX                                            XXX\n" +
                "              XX                                             XX\n" +
                "             XX                                            XXX\n" +
                "           XXX                                            XX\n" +
                "          XX                                             XX\n" +
                "        XXX                                            XXX\n" +
                "       XX                                            XXX\n" +
                "      XX                                            XX\n" +
                "    XXX                                            XX\n" +
                "    X                                             XX\n" +
                "  XX                                            XX\n" +
                " XX                                           XXX\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "name='" + name + '\'' +
                ", gleichseitigTriangle=" + gleichseitigTriangle +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
