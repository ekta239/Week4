package ekta.reflection.intermediate;

import org.junit.jupiter.api.Test;

import ekta.reflection.intermediate.DynamicMethodInvocation;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicMethodInvocationTest {
    @Test
    void testDynamicMethodInvocation() throws Exception {
        assertEquals(15, DynamicMethodInvocation.invokeMethod("add", 10, 5));
        assertEquals(5, DynamicMethodInvocation.invokeMethod("subtract", 10, 5));
        assertEquals(50, DynamicMethodInvocation.invokeMethod("multiply", 10, 5));
    }
}
