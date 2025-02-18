package ekta.annotations.logexecution;

import java.lang.reflect.Method;


public class ExecutionTimer {
    @LogExecutionTime
    public void processData() {
        long start = System.nanoTime();
        try {
            Thread.sleep(100); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) throws Exception {
        ExecutionTimer et = new ExecutionTimer();
        Method method = ExecutionTimer.class.getMethod("processData");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            et.processData();
        }
    }
}