package com.pd.queues;

import java.util.Arrays;

/**
 * @author dpeng
 */
public class ArrayQueueForArray {

    private int first;
    private int last;

    private static final int CAPACITY = 5;
    private int size;
    private int[] array;

    ArrayQueueForArray() {
        array = new int[CAPACITY];
    }

    public void enqueue(int element) {
        if (isFull()) throw new RuntimeException("队列已满");

        array[last] = element;
        last = (last + 1) % CAPACITY;
        size ++;
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("队列为空，没有可出队的元素");

        int current = array[first];
        array[first] = 0;
        first = (first + 1) % CAPACITY;
        size --;
        return current;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("队列为空，没有可出队的元素");

        return array[first];
    }

    public boolean isFull() {
        return array.length == size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
