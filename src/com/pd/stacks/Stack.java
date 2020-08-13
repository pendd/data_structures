package com.pd.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author dpeng
 */
public class Stack {

    private int size;

    private final int capacity = 10;

    private int[] array;

    Stack() {
        array = new int[capacity];
    }

    Stack(int capacity) {
        array = new int[capacity];
    }

    public void push(int element) {
//        expendArray();
        if (array.length == size)
            throw new StackOverflowError();
        array[size ++] = element;
    }

    public int pop() {
        if (size == 0)
            throw new EmptyStackException();
        return array[--size];
    }

    public int peek() {
        if (size == 0)
            throw new EmptyStackException();
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void expendArray() {
        if (array.length != size) return;
        array = Arrays.copyOf(array, size * 2);
    }

    @Override
    public String toString() {
        /*StringBuffer buffer = new StringBuffer("[");
        for (int i = 0; i < size; i++) {
            buffer.append(array[i]);
            if (i != size -1)
                buffer.append(" ");
        }
        buffer.append("]");
        return buffer.toString();*/
        return Arrays.toString(Arrays.copyOfRange(array, 0, size));
    }
}
