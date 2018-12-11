public class RechtwinkligTriangle extends Figure {
    private String name = "Rechtwinkliges Dreieck";
    private double lengthAC;
    private double lengthBC;
    private double area;
    private double circumference;

    public RechtwinkligTriangle(double lengthAC, double lengthBC) {
        this.lengthAC = lengthAC;
        this.lengthBC = lengthBC;
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

    public double getLengthAC() {
        return lengthAC;
    }

    public void setLengthAC(double lengthAC) {
        this.lengthAC = lengthAC;
    }

    public double getLengthBC() {
        return lengthBC;
    }

    public void setLengthBC(double lengthBC) {
        this.lengthBC = lengthBC;
    }

    @Override
    public double calcArea() {
        return this.lengthAC * this.lengthBC / 2;
    }

    @Override
    public double calcCircumference() {
        return this.lengthAC + this.lengthBC + Math.sqrt(Math.pow(this.lengthAC, 2) + Math.pow(this.lengthBC, 2));
    }

    @Override
    public void print() {
        System.out.println("                  XXXX\n" +
                "                XXX  X\n" +
                "              XXX    X\n" +
                "            XXX      X\n" +
                "          XXX        X\n" +
                "        XXX          X\n" +
                "      XXX            X\n" +
                "    XXX              X\n" +
                "  XXX                X\n" +
                "XXX                  X\n" +
                "XXXXXXXXXXXXXXXXXXXXXX\n");
    }

    @Override
    public String toString() {
        return "RechtwinkligTriangle{" +
                "name='" + name + '\'' +
                ", lengthAC=" + lengthAC +
                ", lengthBC=" + lengthBC +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
