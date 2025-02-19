package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.markimpmethod.*;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class ImportantFeatureTest {
    @Test
    void testImportantMethodAnnotations() throws Exception {
        Method criticalMethod = ImportantFeature.class.getMethod("criticalTask");
        ImportantMethod criticalAnnotation = criticalMethod.getAnnotation(ImportantMethod.class);
        assertEquals("HIGH", criticalAnnotation.level());

        Method moderateMethod = ImportantFeature.class.getMethod("moderateTask");
        ImportantMethod moderateAnnotation = moderateMethod.getAnnotation(ImportantMethod.class);
        assertEquals("MEDIUM", moderateAnnotation.level());
    }
}
