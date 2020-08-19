package com.pd.hash;


import java.util.LinkedList;

/**
 * @description: 自己实现一个HashTable
 * @author: pd
 * @date: 2020-08-17 7:42 下午
 */
public class HashTable {

  LinkedList<Entry> [] entries;

  HashTable() {
    this.entries = new LinkedList[5];
  }

  public void put(int key, String value) {
    int index = hash(key);
    if (entries[index] == null)
      entries[index] = new LinkedList<>();

    LinkedList<Entry> bucket = entries[index];
    for (Entry entry : bucket)
      if (entry.key == key) {
        entry.value = value;
        return;
      }

    entries[index].addLast(new Entry(key, value));
  }

  // 重构 优化
  public void putUp(int key, String value) {
    Entry entry = getEntry(key);
    if (entry != null) {
      entry.value = value;
      return;
    }

    getOrCreateBucket(key).add(new Entry(key, value));
  }

  public String get(int key) {
    Entry entry = getEntry(key);
    return entry == null ? null : entry.value;
  }

  public void remove(int key) {
    Entry entry = getEntry(key);

    if (entry == null) throw new IllegalStateException();

    getBucket(key).remove(entry);
  }

  private Entry getEntry(int key) {
    LinkedList<Entry> bucket = getBucket(key);

    for (Entry entry : bucket) {
      if (entry.key == key) {
        bucket.remove(entry);
        return entry;
      }
    }

    return null;
  }

  private LinkedList<Entry> getOrCreateBucket(int key) {
    int index = hash(key);
    LinkedList<Entry> bucket = entries[index];
    if (bucket == null)
      entries[index] = new LinkedList<>();

    return bucket;
  }

  private LinkedList<Entry> getBucket(int key) {
    return entries[hash(key)];
  }

  private int hash(int key) {
    return key % entries.length;
  }

  private class Entry {
    private int key;
    private String value;

    Entry(int key, String value) {
      this.key = key;
      this.value = value;
    }
  }
}
