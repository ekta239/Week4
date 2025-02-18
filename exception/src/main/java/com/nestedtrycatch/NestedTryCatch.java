package com.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        try {
            try {
                int value = arr[index];
                System.out.println("Result: " + (value / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            scanner.close();
        }
    }
}
