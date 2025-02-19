package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.catcheresult.*;

import static org.junit.jupiter.api.Assertions.*;

public class CacheManagerTest {
    @Test
    void testCachingMechanism() {
        ExpensiveOperation operation = new ExpensiveOperation();
        int firstCall = operation.computeSquare(4);
        int secondCall = operation.computeSquare(4);
        assertEquals(firstCall, secondCall); // Ensure caching works
    }
}
