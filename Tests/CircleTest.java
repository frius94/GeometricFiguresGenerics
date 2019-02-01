import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle = new Circle(5);

    @Test
    public void calcArea() {
        assertEquals(Math.pow(circle.getRadius(), 2) * Math.PI, circle.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(circle.getRadius() * 2 * Math.PI, circle.calcCircumference(), 0);
    }
}