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

        System.out.println(" ---浏览器--- ");
        BrowserStack browserStack = new BrowserStack();
        System.out.println(browserStack.add("1"));
        System.out.println(browserStack.toString());

        System.out.println(browserStack.add("2"));
        System.out.println(browserStack.toString());

        System.out.println(browserStack.back());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.back());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.back());
        System.out.println(browserStack.toString());


        System.out.println(browserStack.forward());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.forward());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.add("3"));
        System.out.println(browserStack.toString());

        System.out.println(browserStack.forward());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.back());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.back());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.forward());
        System.out.println(browserStack.toString());

        System.out.println(browserStack.forward());
        System.out.println(browserStack.toString());
    }
}
