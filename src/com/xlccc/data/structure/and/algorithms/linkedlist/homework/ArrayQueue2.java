package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

import sun.security.acl.PermissionImpl;

/**
 * @author Linker
 * @date 2020/10/30 18:58
 * @description：基于链表的队列实现方法
 */
public class ArrayQueue2 {
    /**
     * 初始化 Node head -> Node tail
     */
    private Node head; //队首
    private Node tail; //队尾

    public ArrayQueue2() {
        head = null;
        tail = null;
    }

    //入队
    public boolean enqueue(int data) {
        if (tail == null) {
            head = tail = new Node(data);
            return true;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        return true;
    }

    //出队
    public Integer dequeue() {
        if (head == null) {
            return -1;
        }
        if (head == tail) {
            int data = head.data;
            head = null;
            tail = null;
            return data;
        }

        Node temp = head.next;
        int data = head.data;
        head = temp;
        return data;
    }

    public ArrayQueue2(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }


    class Node {

        public Integer data;
        public Node next;

        public Node() {
        }

        public Node(Integer data) {
            this.data = data;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

