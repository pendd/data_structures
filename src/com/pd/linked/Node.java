package com.pd.linked;

/**
 * @description:
 * @author: pd
 * @date: 2020-08-11 7:40 下午
 */
public class Node {
  private int value;
  private Node next;

  Node() {}

  Node(int value) {
    this.value = value;
  }

  Node(Node next) {
    this.next = next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public int getValue() {
    return value;
  }
}
