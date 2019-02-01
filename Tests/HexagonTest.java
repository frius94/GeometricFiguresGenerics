import org.junit.Test;

import static org.junit.Assert.*;

public class HexagonTest {

    private Hexagon hexagon = new Hexagon(new GleichseitigTriangle(5));

    @Test
    public void calcArea() {
        assertEquals(hexagon.getGleichseitigTriangle().calcArea() * 6, hexagon.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(hexagon.getGleichseitigTriangle().getLength() * 6, hexagon.calcCircumference(), 0);
    }
}