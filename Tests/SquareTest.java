import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private Square square = new Square(5);

    @Test
    public void calcArea() {
        assertEquals(square.getLength() * square.getLength(), square.calcArea(), 0);
    }

    @Test
    public void calcCircumference() {
        assertEquals(square.getLength() * 4, square.calcCircumference(), 0);
    }
}