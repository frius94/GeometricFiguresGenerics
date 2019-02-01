import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rectangle = new Rectangle(5, 5);

    @Test
    public void calcArea() {
        assertEquals(rectangle.getHeight() * rectangle.getWidth(), rectangle.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(rectangle.getHeight() * 2 + rectangle.getWidth() * 2, rectangle.calcCircumference(), 0);
    }
}