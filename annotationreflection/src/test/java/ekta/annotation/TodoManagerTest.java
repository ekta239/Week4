package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.todoannotation.*;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class TodoManagerTest {
    @Test
    void testTodoAnnotations() throws Exception {
        Method loginMethod = TodoManager.class.getMethod("loginFeature");
        Todo loginAnnotation = loginMethod.getAnnotation(Todo.class);
        assertEquals("Implement login validation", loginAnnotation.task());
        assertEquals("Alice", loginAnnotation.assignedTo());
        assertEquals("HIGH", loginAnnotation.priority());

        Method dbMethod = TodoManager.class.getMethod("optimizeDatabase");
        Todo dbAnnotation = dbMethod.getAnnotation(Todo.class);
        assertEquals("Optimize database queries", dbAnnotation.task());
        assertEquals("Bob", dbAnnotation.assignedTo());
        assertEquals("MEDIUM", dbAnnotation.priority()); // Default priority
    }
}
