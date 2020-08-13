package com.pd.queues;

/**
 * @author dpeng
 */
public class ArrayQueueForStackTest {
    public static void main(String[] args) {
        ArrayQueueForStack queue = new ArrayQueueForStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}
