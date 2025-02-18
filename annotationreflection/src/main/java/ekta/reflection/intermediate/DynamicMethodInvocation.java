package ekta.reflection.intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static int invokeMethod(String methodName, int a, int b) throws Exception {
        MathOperations math = new MathOperations();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        return (int) method.invoke(math, a, b);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();
        System.out.println("Result: " + invokeMethod(methodName, 10, 5));
    }
}
