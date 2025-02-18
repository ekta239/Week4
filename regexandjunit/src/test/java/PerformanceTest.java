import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerformanceTest {

    void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void testLongRunningTask() {
        assertThrows(InterruptedException.class, () -> longRunningTask());
    }
}
