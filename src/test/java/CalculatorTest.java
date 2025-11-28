import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSum() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.sum(2, 3));
    }
}
