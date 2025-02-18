import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {

    int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> divide(10, 0));
    }
}
