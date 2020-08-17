package com.pd.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author dpeng
 */
public class HashExercise {

    // 找出第一个不重复的字符
    public static Character getFirstNonRepeated(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars)
            map.merge(c, 1, Integer::sum);

        // 使用这个必须要使用linkedHashMap
//        return map.entrySet().stream().filter(m -> m.getValue() == 1).map(Entry::getKey).findFirst().orElse(Character.MIN_VALUE);

        // 可以使用HashMap 乱序
        for (char c : chars)
            if (map.get(c) == 1) return c;

        return Character.MIN_VALUE;

    }

    // 找出第一个重复的字符
    public static Character findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (set.contains(c))
                return c;

            set.add(c);
        }
        return Character.MIN_VALUE;
    }

    // hash的一种简单实现方式
    public static int hash(String str) {
        int hash = 0;

        for (char ch : str.toCharArray())
            hash += ch;

        // 100 表示hash内部数组大小
        return hash % 100;
    }
}
