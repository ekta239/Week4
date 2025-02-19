package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.customanotation.*;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class TaskManagerTest {
    @Test
    void testTaskAnnotation() throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo annotation = method.getAnnotation(TaskInfo.class);
        assertEquals("High", annotation.priority());
        assertEquals("John Doe", annotation.assignedTo());
    }
}
