import org.junit.Test;

import static org.junit.Assert.*;

public class GleichseitigTriangleTest {

    private GleichseitigTriangle gt = new GleichseitigTriangle(5);

    @Test
    public void calcArea() {
        assertEquals((gt.getLength()/ 4) * Math.sqrt(3), gt.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(3 * gt.getLength(), gt.calcCircumference(), 0);
    }
}