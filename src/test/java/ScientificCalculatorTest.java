import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, ScientificCalculator.squareRoot(4), 0.0f);
        assertEquals(3.0, ScientificCalculator.squareRoot(9), 0.0f);
        assertEquals(4.0, ScientificCalculator.squareRoot(16), 0.0f);
        assertEquals(5.0, ScientificCalculator.squareRoot(25), 0.0f);
        assertEquals(6.0, ScientificCalculator.squareRoot(36), 0.0f);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0), 0.0f);
        assertEquals(1, ScientificCalculator.factorial(1), 0.0f);
        assertEquals(6, ScientificCalculator.factorial(3), 0.0f);
        assertEquals(24, ScientificCalculator.factorial(4), 0.0f);
        assertEquals(720, ScientificCalculator.factorial(6), 0.0f);
    }

    @Test
    public void testnaturalLog() {
        assertEquals(1.0, ScientificCalculator.naturalLog(Math.E), 0.2f);
        assertEquals(0.0, ScientificCalculator.naturalLog(1), 0.2f);
        assertEquals(0.6931, ScientificCalculator.naturalLog(2), 0.2f);
        assertEquals(1.3862, ScientificCalculator.naturalLog(4), 0.2f);
        assertEquals(2.3026, ScientificCalculator.naturalLog(10), 0.2f);
    }

    @Test
    public void testpowerFunction() {
        assertEquals(4.0, ScientificCalculator.powerFunction(2, 2), 0.0f);
        assertEquals(8.0, ScientificCalculator.powerFunction(2, 3), 0.0f);
        assertEquals(9.0, ScientificCalculator.powerFunction(3, 2), 0.0f);
        assertEquals(81.0, ScientificCalculator.powerFunction(3, 4), 0.0f);
        assertEquals(100.0, ScientificCalculator.powerFunction(10, 2), 0.0f);
    }
}
