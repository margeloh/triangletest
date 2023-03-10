import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void testTriangle() {
        int a, b, c;

        Triangle myTriangle = new Triangle();
        // Test case 1: minimum values for a, b, and c
        a = 1;
        b = 1;
        c = 1;
        assertEquals("Equilateral triangle.", myTriangle.checkTriangle(a, b, c));

        // Test case 2: maximum value for a, minimum values for b and c
        a = 200;
        b = 1;
        c = 1;
        assertEquals("Not a triangle.", myTriangle.checkTriangle(a, b, c));

        // Test case 3: maximum value for b, minimum values for a and c
        a = 1;
        b = 200;
        c = 1;
        assertEquals("Not a triangle.", myTriangle.checkTriangle(a, b, c));

        // Test case 4: maximum value for c, minimum values for a and b
        a = 1;
        b = 1;
        c = 200;
        assertEquals("Not a triangle.", myTriangle.checkTriangle(a, b, c));

        // Test case 5: maximum values for a, b, and c
        a = 200;
        b = 200;
        c = 200;
        assertEquals("Equilateral triangle.", myTriangle.checkTriangle(a, b, c));

        // Test case 6: minimum value for b and maximum values for a and c
        a = 200;
        b = 1;
        c = 200;
        assertEquals("Isosceles triangle.", myTriangle.checkTriangle(a, b, c));

        // Test case 7: different for a, b, and c
        a = 5;
        b = 3;
        c = 4;
        assertEquals("Scalene triangle.", myTriangle.checkTriangle(a, b, c));


    }
    // Branch coverage
    @Test
    public void isTriangle() {
        Triangle myTriangle = new Triangle();

        assertFalse(myTriangle.isTriangle(-1, 2, 3));
        assertFalse(myTriangle.isTriangle(0, 1, 2));
        assertFalse(myTriangle.isTriangle(1, -2, 3));
        assertFalse(myTriangle.isTriangle(1, 2, -3));
        assertFalse(myTriangle.isTriangle(1, 2, 3));

        assertTrue(myTriangle.isTriangle(2, 3, 4));
        assertTrue(myTriangle.isTriangle(3, 4, 5));
        assertTrue(myTriangle.isTriangle(5, 12, 13));
    }
    // Equivalence Partitioning
    @Test
    public void testValidEquilateralTriangle() {
        Triangle myTriangle = new Triangle();

        assertTrue(myTriangle.isTriangle(3, 3, 3));
        assertTrue(myTriangle.isTriangle(5, 5, 5));

        assertTrue(myTriangle.isTriangle(3, 3, 4));
        assertTrue(myTriangle.isTriangle(5, 5, 7));

        assertTrue(myTriangle.isTriangle(3, 4, 5));
        assertTrue(myTriangle.isTriangle(7, 8, 10));

        assertFalse(myTriangle.isTriangle(1, 2, 4));
        assertFalse(myTriangle.isTriangle(0, 0, 0));
    }

}