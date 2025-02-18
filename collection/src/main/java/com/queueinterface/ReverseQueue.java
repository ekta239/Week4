package com.queueinterface;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static <T> Queue<T> reverse(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(java.util.List.of(10, 20, 30));
        System.out.println("Reversed Queue: " + reverse(queue)); // Output: [30, 20, 10]
    }
}
