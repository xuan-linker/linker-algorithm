package com.xlccc.data.structure.and.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Linker
 * @date 2020/8/25 23:41
 * @description：堆栈（通过集合实现）
 */
public class Stack2 {
    public static void main(String[] args) {
        Stack2.Stack stack = new Stack2.Stack();
        /**
         * 插入数据
         */
        stack.push(1);
        stack.push(2);
        stack.push(3);
        /**
         * 打印全部
         */
        System.out.println(stack.list.toString());

        /**
         * 弹出数据
         */
        System.out.println(stack.pop());
        System.out.println(stack.list.toString());

        System.out.println(stack.pop());
        System.out.println(stack.list.toString());

        /**
         * 测试再次插入，弹出
         */
        stack.push(4);
        System.out.println(stack.list.toString());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    protected static class Stack {
        List<Integer> list = new ArrayList<Integer>();
        int index = 0; //下标

        //入栈push
        public void push(int data) {
            list.add(data);
            index++;
        }


        //出栈pop
        public int pop() {
            if (!list.isEmpty()) {
                index--;
                return list.remove(index);
            } else {
                return -1;
            }
        }
    }
}
