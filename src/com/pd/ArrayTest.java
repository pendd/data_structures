package com.pd;


/**
 * @author dpeng
 */
public class ArrayTest {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(0);
        array.insert(1);
        array.insert(2);
//        array.insert(3);
        array.print();
        System.out.println();
        array.removeAtIndex(0);
        array.print();
        System.out.println();
        System.out.println(array.length());
        System.out.println(array.indexOf(10));


    }
}
