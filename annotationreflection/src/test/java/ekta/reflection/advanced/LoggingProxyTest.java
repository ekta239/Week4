package ekta.reflection.advanced;

import org.junit.jupiter.api.Test;

import ekta.reflection.advanced.Greeting;
import ekta.reflection.advanced.GreetingImpl;
import ekta.reflection.advanced.LoggingProxy;

import static org.junit.jupiter.api.Assertions.*;

public class LoggingProxyTest {
    @Test
    void testProxyLogging() {
        Greeting greeting = (Greeting) LoggingProxy.createProxy(new GreetingImpl());
        assertDoesNotThrow(greeting::sayHello);
    }
}
