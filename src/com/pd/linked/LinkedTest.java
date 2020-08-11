package com.pd.linked;

/**
 * @description:
 * @author: pd
 * @date: 2020-08-11 7:52 下午
 */
public class LinkedTest {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(5);
    System.out.println(list.indexOf(10));
    System.out.println(list.indexOf(50));
    System.out.println(list.contains(10));
    System.out.println(list.contains(50));
    System.out.println(list);
    list.deleteFirst();
    System.out.println(list);
    list.deleteLast();
    System.out.println(list);
  }
}
