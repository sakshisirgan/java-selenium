package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import main.java.Box;

public class BoxTest {

    Box box = new Box();

    @Test
    public void testCircleArea() {
    	double delta = 0.001;
        assertEquals(12.566, box.circleArea(2),delta);
    }

    @Test
    public void testTriangleArea() {
        assertEquals(15.0, box.triangleArea(10, 3));
    }

    @Test
    public void testSquareArea() {
        assertEquals(4.0, box.squareArea(2));
    }

    @Test
    public void testRectangleArea() {
        assertEquals(18.0, box.rectangleArea(6, 3));
    }

    @Test
    public void testSimpleInterest() {
        assertEquals(500.0, box.simpleInterest(1000, 10, 5));
    }

    @Test
    public void testCalculateAmount() {
        assertEquals(2110.51, box.calculateAmount());
    }
}
