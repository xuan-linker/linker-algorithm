package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

/**
 * @author Linker
 * @date 2020/10/28 21:50
 * @description：
 */
public class LinkedList implements List {

    int size = 0;

    Node first;

    Node last;

    public LinkedList() {
    }



    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(Node prev, int element, Node next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }
}


