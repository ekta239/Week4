package ekta.reflection.basic;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static int invokeMultiply(int a, int b) throws Exception {
        Calculator calculator = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        return (int) method.invoke(calculator, a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Result: " + invokeMultiply(5, 4));
    }
}
