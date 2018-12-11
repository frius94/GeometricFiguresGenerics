public class Oval extends Figure {
    private String name = "Oval";
    private double radiusLength;
    private double radiusHeigth;
    private double area;
    private double circumference;

    public Oval(double radiusLength, double radiusHeigth) {
        this.radiusLength = radiusLength;
        this.radiusHeigth = radiusHeigth;
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

    public double getRadiusLength() {
        return radiusLength;
    }

    public void setRadiusLength(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public double getRadiusHeigth() {
        return radiusHeigth;
    }

    public void setRadiusHeigth(double radiusHeigth) {
        this.radiusHeigth = radiusHeigth;
    }

    @Override
    public double calcArea() {
        return this.radiusHeigth * this.radiusLength * Math.PI;
    }

    @Override
    public double calcCircumference() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.radiusHeigth, 2) + Math.pow(this.radiusLength, 2)) / 2);
    }

    @Override
    public void print() {
        System.out.println("         XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "     XXXXX                                XXXXX\n" +
                "  XXXX                                        XXX\n" +
                " XX                                             XXX\n" +
                "XX                                                XX\n" +
                "X                                                  X\n" +
                "X                                                  XX\n" +
                "X                                                  XX\n" +
                "XXX                                                X\n" +
                "  XXX                                             XX\n" +
                "    XXX                                         XXX\n" +
                "       XXX                                    XXX\n" +
                "         XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
    }

    @Override
    public String toString() {
        return "Oval{" +
                "name='" + name + '\'' +
                ", radiusLength=" + radiusLength +
                ", radiusHeigth=" + radiusHeigth +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
