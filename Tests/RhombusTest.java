import org.junit.Test;

import static org.junit.Assert.*;

public class RhombusTest {
    private Rhombus rhombus = new Rhombus(new GleichseitigTriangle(5));

    @Test
    public void calcArea() {
        assertEquals(rhombus.getGleichseitigTriangle().calcArea() * 2, rhombus.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(rhombus.getGleichseitigTriangle().getLength() * 4, rhombus.calcCircumference(), 0);
    }
}