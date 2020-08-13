package com.pd.queues;

/**
 * @description:
 * @author: pd
 * @date: 2020-08-13 11:18 下午
 */
public class PriorityQueueTest {
  public static void main(String[] args) {
    PriorityQueue queue = new PriorityQueue();
    queue.add(8);
    queue.add(10);
//    queue.add(20);
//    queue.add(5);
//    queue.add(1);

    while (!queue.isEmpty())
      System.out.println(queue.remove());
  }
}
