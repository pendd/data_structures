package com.pd.linked;

/**
 * @author dpeng
 */
public class LinkedListTeaTest {
    public static void main(String[] args) {
        LinkedListTea list = new LinkedListTea();
        list.addFirst(9);
        list.addLast(10);
        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(8);
//        list.addFirst(7);
        /*System.out.println(list.toString());
        System.out.println(list.indexOf(9));
        System.out.println(list.indexOf(100));
        System.out.println(list.contains(10));
        System.out.println(list.contains(100));
        list.removeFirst();
        System.out.println(list.toString());*/
//        list.removeFirst();
        System.out.println(list.toString());
        System.out.println(list.getKthFromTheEnd(2));
//        System.out.println(list.getKthFromTheEnd(2));
//        System.out.println(list.size());
        list.reverse();
        System.out.println(list.toString());
    }
}
