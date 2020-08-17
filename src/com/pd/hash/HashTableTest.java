package com.pd.hash;

/**
 * @description:
 * @author: pd
 * @date: 2020-08-17 8:30 下午
 */
public class HashTableTest {
  public static void main(String[] args) {
    HashTable table =  new HashTable();
    table.put(6, "A");  // hash 1
    table.put(8, "B");  // hash 3
    table.put(11, "C"); // hash 1
    table.put(6, "A+");
    System.out.println(table.get(10));
  }
}
