package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.repetableannotation.*;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class BugTrackerTest {
    @Test
    void testBugReports() throws Exception {
        Method method = BugTracker.class.getMethod("fixBugs");
        BugReports reports = method.getAnnotation(BugReports.class);
        assertNotNull(reports);
        assertEquals(2, reports.value().length);
        assertEquals("Fix login issue", reports.value()[0].description());
        assertEquals("Resolve UI bug in dashboard", reports.value()[1].description());
    }
}
