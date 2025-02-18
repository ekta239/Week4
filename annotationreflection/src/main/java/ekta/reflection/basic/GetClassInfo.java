package ekta.reflection.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {
    public static void getClassDetails(String className) {
        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("Class Name: " + clazz.getName());

            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println(constructor);
            }

            System.out.println("\nFields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field);
            }

            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = scanner.nextLine();
        getClassDetails(className);
    }
}
