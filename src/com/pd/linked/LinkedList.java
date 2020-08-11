package com.pd.linked;

/**
 * @description:
 * @author: pd
 * @date: 2020-08-11 7:42 下午
 */
public class LinkedList {
  private Node first;
  private Node last;

  LinkedList() {
    last = new Node();
    first = new Node(last);
  }

  public int indexOf(int value) {
    Node node = first;
    int index = 0;
    while (node.getNext() != last) {
      if (node.getValue() == value) return index;
      node = node.getNext();
      index ++;
    }
    return -1;
  }

  public boolean contains(int value) {
    Node node = first;
    while (node.getNext() != last) {
      if (node.getValue() == value) return true;
      node = node.getNext();
    }
    return false;
  }

  public void deleteFirst() {
    Node node = first.getNext();
    first.setNext(node.getNext());
    node = null;
  }

  public void deleteLast() {
    if (first.getNext() == last) return;
    Node node = first;
    while (node.getNext().getNext() != last) {
      node = node.getNext();
    }
    Node lastNode = node.getNext();
    node.setNext(last);
    lastNode = null;
  }

  public void addFirst(int value) {
    Node node = new Node(value);

    Node tempNode = first.getNext();
    first.setNext(node);
    node.setNext(tempNode);
  }

  public void addLast(int value) {
    Node node = new Node(value);

    Node loopNode = first;
    while (loopNode.getNext() != last) {
      loopNode = loopNode.getNext();
    }

    loopNode.setNext(node);
    node.setNext(last);
  }


  @Override
  public String toString() {
    Node node = first.getNext();
    StringBuilder builder = new StringBuilder("[");
    while (node != null) {
      builder.append(node.getValue());
      node = node.getNext();
      if (node.getNext() == null) break;
      builder.append(" ");
    }
    builder.append("]");
    return builder.toString();
  }
}
