import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTests {

    @Test
    public void testIfNameIsJack(){
        String expected = "Jack";
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
}
