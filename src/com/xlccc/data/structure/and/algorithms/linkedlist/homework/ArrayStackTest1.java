package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

/**
 * @author Linker
 * @date 2020/10/30 16:00
 * @description：
 */
public class ArrayStackTest1 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        System.out.println(stack.push("1"));
        System.out.println(stack.push("2"));
        System.out.println(stack.push("3"));
        System.out.println(stack.push("4"));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
