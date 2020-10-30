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

        System.out.println("---LinkedArrayQueue2---");
        ArrayQueue2 queue2 = new ArrayQueue2();
        System.out.println(queue2.enqueue(1));
        System.out.println(queue2.enqueue(2));
        System.out.println(queue2.enqueue(3));
        System.out.println(queue2.enqueue(4));
        System.out.println("---LinkedArrayQueue2- 出队--");

        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());


    }
}
