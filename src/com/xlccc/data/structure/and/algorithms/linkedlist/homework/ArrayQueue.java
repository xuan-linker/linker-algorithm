package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/10/30 16:45
 * @description：用数组实现的队列
 */
public class ArrayQueue {
    // 数组:items,数组大小:n
    private String[] items;

    private int n; // 数组大小
    private int head = 0; // 队头下标
    private int tail = 0; // 队尾下标


    // 初始化：申请一个大小为capacity的数组

    public ArrayQueue(int capacity) {
        this.items = new String[capacity];
        this.n = capacity;
    }

    // 入队
    public boolean enqueue(String item) {
        if (tail == n) {
            //没余量，返回false
            if (tail - head == n) {
                return false;
            } else {
                //有余量，迁移
                for (int i = head; i < tail; i++) {
                    items[i - head] = items[i];
                }
                tail -= head;
                head = 0;
            }
        }

        items[tail++] = item;

        return true;
    }

    // 出队
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        return items[head++];
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", n=" + n +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
