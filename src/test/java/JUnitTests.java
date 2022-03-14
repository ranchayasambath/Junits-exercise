import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTests {

    @Test
    public void testIfNameIsKat(){
        String expected = "jack";
        String actual = "jack";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.0, price-discount, 0.5); // delta: margin of error
        assertNotEquals(4.2, price-discount, 0.5);
    }
    @Test
        public void testIfObjectsAreDifferent() {
            Object dog = new Object();
            Object sheep = new Object();
            Object clonedSheep = sheep;

            assertNotSame(sheep, dog);
            assertSame(sheep, clonedSheep);
        }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    }
