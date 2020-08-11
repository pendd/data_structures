## Big O

> What is Big O ?

==**We use Big O to describe the performance of an algorithm**==

Big O 关注的是性能消耗的增长

![image-20200811145115509](C:\Users\StupidBoy\AppData\Roaming\Typora\typora-user-images\image-20200811145115509.png)

![image-20200811145148040](C:\Users\StupidBoy\AppData\Roaming\Typora\typora-user-images\image-20200811145148040.png)

### O(1)

> 算法的性能消耗是恒定的

```java
public void log(int[] numbers) {
    // 无论数组numbers的长度有多大，里面有多少项，都只取第一个，恒定的时间
	System.out.println(numbers[0]);
}
```

### O(n)

> 算法的性能消耗是线性的

```java
public void log(int[] numbers) {
    // 线性增长 O(n)
    for(int number : numbers) {
        System.out.println(number);
    }
}

public void log(int[] numbers) {
    // 线性增长 O(1 + n + 1)  => O(n)  当n趋于无穷时，就相当于O(n)
    System.out.println();
    for(int number : numbers) {
        System.out.println(number);
    }
    System.out.println();
}

public void log(int[] numbers) {
    // 线性增长 O(n + n) = O(2n) n 和 2n 都是线性增长 所以相当于 O(n) 
    for(int number : numbers) {
        System.out.println(number);
    }
    
    for(int number : numbers) {
        System.out.println(number);
    } 
}

public void log(int[] numbers, String[] names) {
    // 线性增长 O(n + m) => O(n)
    for(int number : numbers) {  // O(n)
        System.out.println(number); 
    }
    
    for(int name : names) {  // O(m)
        System.out.println(name);
    } 
}
```

![image-20200811144406212](C:\Users\StupidBoy\AppData\Roaming\Typora\typora-user-images\image-20200811144406212.png)

### O(n ^ 2)

```java
public void log(int[] numbers) {
   // O(n * n) = O(n ^ 2)
    for(int first : numbers) {  // O(n)
        for(int second : numbers) // O(n)
        System.out.println(first + "," + second); 
    }
}

public void log(int[] numbers) {
    // O(n ^ 2 + n)  一个数的平方总散大于等于它自己  所以相当于 O(n ^ 2)
    for( int number : numbers) {   // O(n)
        System.out.println(number);
    }
 	// O(n ^ 2)
    for(int first : numbers) {  // O(n)
        for(int second : numbers) // O(n)
        System.out.println(first + "," + second); 
    }
}
```

### O(log n)

> Binary Search 就是一种 O(log n)

![image-20200811144450205](C:\Users\StupidBoy\AppData\Roaming\Typora\typora-user-images\image-20200811144450205.png)

### O(2^n)

```java

```

![image-20200811145026442](C:\Users\StupidBoy\AppData\Roaming\Typora\typora-user-images\image-20200811145026442.png)

### Space Complexity 

```java
public void greet(String[] names) {
    // 输入数组的项数与输出是无关的  空间复杂度为 O(1)
    for( int i = 0; i < names.length; i ++) 
        System.out.println("Hi " + names[i]);
}

public void greet(String[] names) {
    // 输入数组的项数与输出是想关的  空间复杂度为 O(n)
    String[] copy = new String[names.length];
    
    for( int i = 0; i < names.length; i ++) 
        System.out.println("Hi " + names[i]);
}
```

## Arrays

- **Lookup by Index  O(1)**
- **Lookup by Value  O(n)**
- **Insert                      O(n)**
- **Delete                     O(n)**

```java
public class Array {

    private int[] data;

    // 记录添加的元素个数   例如 int[10]  但是添加了5个元素进来  
    // 这个时候应该输出5个元素的值 后面5个0不应该输出
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

```

## Linked Lists

> 由于链表中的节点是离散分布于内存中，它们可能并不是一个挨着另一个，这就是他们必须保存下一个节点引用的原因，所以我们无法通过序号快速查找节点，我们需要从头找到尾，直到找到对应序号，所以时间复杂度为**O(n)**

Lookup

​		By Value    O(n)

​		By Index    O(n)

Insert

​		At the End  O(1)

​		At the Beginning   O(1)

​		In the Middle   O(n)  因为查找到节点是O(n)  更新节点是O(1)