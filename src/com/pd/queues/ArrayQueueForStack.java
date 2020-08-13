package com.pd.queues;


import java.util.Stack;

/**
 * @author dpeng
 */
public class ArrayQueueForStack {

    private Stack<Integer> input;
    private Stack<Integer> output;

    ArrayQueueForStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // O(1)
    public void enqueue(int element) {
        input.push(element);
    }

    // O(n)
    public int dequeue() {
        if (isEmpty())
            throw  new IllegalStateException();

        if (output.isEmpty())
            while (! input.isEmpty())
                output.push(input.pop());

        return output.pop();
    }

    public boolean isEmpty() {
        return input.empty() && output.empty();
    }

}
