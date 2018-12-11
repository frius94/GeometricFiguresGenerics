public abstract class Figure implements Geometry {

    @Override
    public int compareTo(Geometry other) {
        if ((this.calcArea() > other.calcArea())) {
            return 1;
        } else if (this.calcArea() < other.calcArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
