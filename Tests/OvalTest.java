import org.junit.Test;

import static org.junit.Assert.*;

public class OvalTest {
    private Oval oval = new Oval(5, 5);

    @Test
    public void calcArea() {
        assertEquals(oval.getRadiusHeigth() * oval.getRadiusLength() * Math.PI, oval.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(2 * Math.PI * Math.sqrt((Math.pow(oval.getRadiusHeigth(), 2) + Math.pow(oval.getRadiusLength(), 2)) / 2), oval.calcCircumference(), 0);
    }
}