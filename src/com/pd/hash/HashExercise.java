package com.pd.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author dpeng
 */
public class HashExercise {

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
}
