import org.junit.jupiter.api.Test;

import com.junit.*;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
