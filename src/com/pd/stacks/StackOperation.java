package com.pd.stacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author dpeng
 */
public class StackOperation {

    private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    private String str;

    StackOperation(String str) {
        this.str = str;
    }

    public String reverseStr() {
        if (str == null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
            stack.push(c);

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty())
            builder.append(stack.pop());

        return builder.toString();
    }

    public boolean isBalanced() {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(' , ')');
        map.put('[' , ']');
        map.put('<' , '>');
        map.put('{' , '}');
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) stack.push(c);
            if (map.containsValue(c)) {
                if (stack.empty()) return false;
                Character right = stack.pop();
                if (!c.equals(map.get(right))) return false;
            }
        }

        return stack.empty();
    }

    public boolean isBalanced2() {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (isLeftBracket(c)) stack.push(c);
            if (isRightBracket(c)) {
                if (stack.empty()) return false;

                Character left = stack.pop();
                if (!bracketsMatch(left, c)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
