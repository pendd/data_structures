package com.pd.queues;

import java.util.Queue;
import java.util.Stack;

/**
 * @author dpeng
 */
public class QueueOperation {

    // add remove isEmpty
    public static Queue reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.empty())
            queue.add(stack.pop());

        return queue;
    }
}
