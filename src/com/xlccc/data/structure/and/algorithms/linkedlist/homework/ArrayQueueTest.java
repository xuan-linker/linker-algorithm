package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

/**
 * @author Linker
 * @date 2020/10/30 17:17
 * @description：
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        System.out.println(arrayQueue.enqueue("1"));
        System.out.println(arrayQueue.enqueue("2"));
        System.out.println(arrayQueue.enqueue("3"));
        System.out.println(arrayQueue.enqueue("4"));
        System.out.println(arrayQueue.enqueue("5"));
        System.out.println(arrayQueue.enqueue("6"));
        arrayQueue.toString();

        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.toString());

    }
}
