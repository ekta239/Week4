package ekta.reflection.basic;

import org.junit.jupiter.api.Test;

import ekta.reflection.basic.InvokePrivateMethod;

import static org.junit.jupiter.api.Assertions.*;

public class InvokePrivateMethodTest {
    @Test
    void testInvokePrivateMethod() throws Exception {
        assertEquals(20, InvokePrivateMethod.invokeMultiply(5, 4));
        assertEquals(50, InvokePrivateMethod.invokeMultiply(10, 5));
    }
}
