package ekta.reflection.advanced;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Define an interface
interface Greeting {
    void sayHello();
}

// Implement the interface
class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}

// Dynamic Proxy for Logging
class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Executing method: " + method.getName());
        return method.invoke(target, args);
    }

    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            new LoggingProxy(target)
        );
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) LoggingProxy.createProxy(new GreetingImpl());
        greeting.sayHello();
    }
}
