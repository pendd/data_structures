package com.pd.queues;

/**
 * @description:
 * @author: pd
 * @date: 2020-08-13 11:01 下午
 */
public class PriorityQueue {

  private int[] array;
  private int size;

  PriorityQueue() {
    array = new int[5];
  }

  public void insert(int element) {
    if (isFull())
      throw new RuntimeException("队列已满");
    if (isEmpty()) {
      array[size++] = element;
      return;
    }

    for (int i = size - 1; i >= 0; i--) {
      if (array[i] >= element) {
        array[i + 1] = array[i];

        if (i == 0) {
          array[0] = element;
        }
      }
      else {
        array[i + 1] = element;
        break;
      }
    }
    size ++;
  }

  public int remove() {
    if (isEmpty())
      throw new RuntimeException("队列为空");
    int result = array[0];
    for (int i = 0; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    array[--size] = 0;
    return result;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == array.length;
  }

  public void add(int item) {
    if (isFull())
      throw new RuntimeException("队列已满");

    int i = shiftItemsToInsert(item);
    array[i] = item;
    size ++;
  }

  private int shiftItemsToInsert(int item) {
    int i;
    for (i = size -1; i >= 0; i--) {
      if (array[i] > item)
        array[i + 1] = array[i];
      else
        break;
    }
    return i + 1;
  }
}
