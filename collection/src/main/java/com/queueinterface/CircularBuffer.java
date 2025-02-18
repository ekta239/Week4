package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBuffer {
    private final int capacity;
    private final Queue<Integer> queue;

    public CircularBuffer(int size) {
        this.capacity = size;
        this.queue = new LinkedList<>();
    }

    public void insert(int value) {
        if (queue.size() == capacity) {
            queue.poll(); // Remove the oldest element
        }
        queue.offer(value);
    }

    public Queue<Integer> getBuffer() {
        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        System.out.println(buffer.getBuffer()); // Output: [1, 2, 3]
        buffer.insert(4);
        System.out.println(buffer.getBuffer()); // Output: [2, 3, 4]
    }
}
