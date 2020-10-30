package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/10/30 21:02
 * @description：循环队列
 */
public class ArrayQueue3 {

    /**
     * (tail+1)%n=head
     */
    private int[] items; //数组
    private int n; //长度
    private int head; //队首
    private int tail; //队尾

    public ArrayQueue3(int n) {
        this.n = n;
        this.head = 0;
        this.tail = 0;
        this.items = new int[n];
    }

    //入队
    public boolean enqueue(int data) {
        // 队满
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = data;
        tail = (tail + 1) % n;
        return true;
    }

    //出队
    public Integer dequeue() {
        if (head % n == tail) {
            return -1;
        }
        int data = items[head];
        head = (head + 1) % n;
        return data;

    }

    @Override
    public String toString() {
        return "ArrayQueue3{" +
                "items=" + Arrays.toString(items) +
                ", n=" + n +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
