package com.xlccc.data.structure.and.algorithms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author Linker
 * @date 2020/8/25 23:47
 * @description：
 */
public class Stack3 {
    public static void main(String[] args) {
        Stack3.Stack stack = new Stack3.Stack();
        /**
         * 插入数据
         */
        stack.push(1);
        stack.push(2);
        stack.push(3);
        /**
         * 打印全部
         */
        System.out.println(stack.queueA.toString());
        System.out.println(stack.queueB.toString());

        /**
         * 弹出数据
         */
        System.out.println(stack.pop());
        System.out.println(stack.queueA.toString());
        System.out.println(stack.queueB.toString());

        System.out.println(stack.pop());
        System.out.println(stack.queueA.toString());
        System.out.println(stack.queueB.toString());

        /**
         * 测试再次插入，弹出
         */
        stack.push(4);
        System.out.println(stack.queueA.toString());
        System.out.println(stack.queueB.toString());
        System.out.println(stack.pop());
        System.out.println(stack.queueA.toString());
        System.out.println(stack.queueB.toString());

    }

    /**
     * 两个队列实现一个堆栈
     */
    protected static class Stack {
        Queue<Integer> queueA = new ArrayDeque<Integer>();
        Queue<Integer> queueB = new ArrayDeque<Integer>();

        //入栈
        public void push(int data) {
            if (queueA.isEmpty()) {
                queueB.add(data);
            } else {
                queueA.add(data);
            }
        }

        //出栈
        public int pop() {
            //如果queueA为空，queueB有元素，将queueB的元素依次放入queueA中，直到最后一个元素，弹出
            if (queueA.isEmpty()) {
                while (queueB.size() > 1) {
                    queueA.add(queueB.poll());
                }
                return queueB.poll();
            }
            if (queueB.isEmpty()) {
                while (queueA.size() > 1) {
                    queueB.add(queueA.poll());
                }
                return queueA.poll();
            }
            return -1;
        }
    }

}
