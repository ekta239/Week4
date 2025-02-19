package ekta.reflection.advanced;

import org.junit.jupiter.api.Test;

import ekta.reflection.advanced.MethodExecutionTimer;
import ekta.reflection.advanced.Task;

import static org.junit.jupiter.api.Assertions.*;

public class MethodExecutionTimerTest {
    @Test
    void testExecutionTimeMeasurement() throws Exception {
        long executionTime = MethodExecutionTimer.measureExecutionTime(Task.class, "execute");
        assertTrue(executionTime > 0);
    }
}
