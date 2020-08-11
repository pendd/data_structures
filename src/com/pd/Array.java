package com.pd;

/**
 * @author dpeng
 */
public class Array {

    private int[] data;

    // 记录添加的元素个数   例如 int[10]  但是添加了5个元素进来  这个时候应该输出5个元素的值 后面5个0不应该输出
    private int count;

    Array(int size) {
        data = new int[size];
    }

    public void print() {
        // 这里为count 而不是data.length
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + "  ");
        }
    }

    public void insert(int item) {
        expandArray();
        data[count ++] = item;
    }

    /**
     * 时间复杂度：
     *  最好的情况：O(1)
     *  最坏的情况：O(n)
     *  而时间复杂度考虑的情况是最坏的情况，所以indexOf方法的时间复杂度为O(n)
     */
    public int indexOf(int item) {
        for (int i = 0; i < data.length; i++)
            if (data[i] == item)
                return i;
        // 数组中不存在该元素
        return -1;
    }

    public int length() {
        return count;
    }

    public void removeAtIndex(int index)  {
        count --;
        if (index >= count || index < 0) throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            data[i] = data[i + 1];
    }

    private void expandArray() {
        if (data.length == count) {
            copyArray();
        }
    }
    
    private void copyArray() {
        int[] newData = new int[count * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
