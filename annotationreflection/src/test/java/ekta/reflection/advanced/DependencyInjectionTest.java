package ekta.reflection.advanced;

import org.junit.jupiter.api.Test;

import ekta.reflection.advanced.Application;
import ekta.reflection.advanced.DependencyInjection;

import static org.junit.jupiter.api.Assertions.*;

public class DependencyInjectionTest {
    @Test
    void testDependencyInjection() throws Exception {
        Application app = new Application();
        DependencyInjection.injectDependencies(app);
        assertDoesNotThrow(app::run);
    }
}
