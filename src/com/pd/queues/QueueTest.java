package com.pd.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dpeng
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
        System.out.println(QueueOperation.reverse(queue));

        System.out.println("--------------");

        ArrayQueueForArray array = new ArrayQueueForArray();
        array.enqueue(1);
        array.enqueue(2);
        array.enqueue(3);
        array.enqueue(4);
        array.enqueue(5);
        System.out.println(array);

        System.out.println(array.dequeue());
        System.out.println(array.dequeue());
        System.out.println(array);

        array.enqueue(6);
        System.out.println(array);

    }
}
