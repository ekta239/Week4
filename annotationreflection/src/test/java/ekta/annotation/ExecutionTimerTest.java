package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.logexecution.*;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class ExecutionTimerTest {
    @Test
    void testExecutionTimeAnnotation() throws Exception {
        Method method = ExecutionTimer.class.getMethod("processData");
        assertTrue(method.isAnnotationPresent(LogExecutionTime.class));
    }
}
