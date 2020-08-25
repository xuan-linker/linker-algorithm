package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/8/25 23:23
 * @description：堆栈（通过数组实现）
 */
public class Stack1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        /**
         * 插入数据
         */
        stack.push(1);
        stack.push(2);
        stack.push(3);
        /**
         * 打印全部
         */
        System.out.println(Arrays.toString(stack.a));

        /**
         * 弹出数据
         */
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.a));

        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.a));

        /**
         * 测试再次插入，弹出
         */
        stack.push(4);
        System.out.println(Arrays.toString(stack.a));
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    /**
     * 核心：通过i下标控制数据是否有效。左侧有效，右侧无效
     * 使用int数组保存数据特点：先进后出，后进先出
     */
    protected static class Stack {
        int[] a = new int[10];
        int i = 0;

        //入栈push
        public void push(int data) {
            a[++i] = data;
        }

        //出栈pop
        public int pop() {
            if (i > 0) {
                return a[i--];
            } else {
                return -1;
            }
        }
    }
}
