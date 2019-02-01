import org.junit.Test;

import static org.junit.Assert.*;

public class RechtwinkligTriangleTest {
    private RechtwinkligTriangle rt = new RechtwinkligTriangle(5, 5);

    @Test
    public void calcArea() {
        assertEquals(rt.getLengthAC() * rt.getLengthBC() / 2, rt.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(rt.getLengthAC() + rt.getLengthBC() + Math.sqrt(Math.pow(rt.getLengthAC(), 2) + Math.pow(rt.getLengthBC(), 2)), rt.calcCircumference(), 0);
    }
}