// import static org.junit.Assert.*;
// import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ScientificCalculatorTest {

    @Test
    public void testSquareRootTruePositive() {
        assertEquals(2.0, ScientificCalculator.squareRoot(4.0), 0.0f);
    }

    @Test
    public void testSquareRootFalsePositive() {
        assertNotEquals(3.0, ScientificCalculator.squareRoot(4.0), 0.0f);
    }

    @Test
    public void testFactorialTruePositive() {
        assertEquals(120, ScientificCalculator.factorial(5),0.0f);
    }

    @Test
    public void testFactorialFalsePositive() {
        assertNotEquals(25, ScientificCalculator.factorial(5),0.0f);
    }

    @Test
    public void testNaturalLogTruePositive() {
        assertEquals(1.0, ScientificCalculator.naturalLog(Math.E), 0.2f);
    }

    @Test
    public void testNaturalLogFalsePositive() {
        assertNotEquals(2.0, ScientificCalculator.naturalLog(Math.E), 0.2f);
    }

    @Test
    public void testPowerTruePositive() {
        assertEquals(16.0, ScientificCalculator.powerFunction(2.0, 4.0), 0.0f);
    }

    @Test
    public void testPowerFalsePositive() {
        assertNotEquals(8.0, ScientificCalculator.powerFunction(2.0, 4.0), 0.0f);
    }
}
