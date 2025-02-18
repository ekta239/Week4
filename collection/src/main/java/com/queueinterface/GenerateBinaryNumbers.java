package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String num = queue.poll();
            System.out.print(num + " ");
            queue.offer(num + "0");
            queue.offer(num + "1");
        }
    }

    public static void main(String[] args) {
        generateBinary(5); // Output: 1 10 11 100 101
    }
}
