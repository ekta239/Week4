package ekta.reflection.advanced;

import java.lang.reflect.Method;

// Define a sample class
class Task {
    public void execute() throws InterruptedException {
        Thread.sleep(500); // Simulate work
    }
}

// Reflection-based execution timer
public class MethodExecutionTimer {
    public static long measureExecutionTime(Class<?> clazz, String methodName) throws Exception {
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getDeclaredMethod(methodName);
        
        long startTime = System.nanoTime();
        method.invoke(obj);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Execution Time: " + measureExecutionTime(Task.class, "execute") + " ns");
    }
}
