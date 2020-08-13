package com.pd.stacks;

/**
 * @author dpeng
 */
public class StackTest {
    public static void main(String[] args) {
       /* String str = "(([<1>])))";
        StackOperation stack = new StackOperation(str);
        System.out.println(stack.isBalanced());
        System.out.println(stack.isBalanced2());
        System.out.println(new Stack<>().pop());*/

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }

}
