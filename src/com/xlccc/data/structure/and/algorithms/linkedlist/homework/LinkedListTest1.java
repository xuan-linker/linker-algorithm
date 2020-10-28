package com.xlccc.data.structure.and.algorithms.linkedlist.homework;


/**
 * @author Linker
 * @date 2020/10/28 21:28
 * @description：基础单向链表
 */
public class LinkedListTest1 {

    /**
     * 插入结点（前插法，后插法）
     * 遍历结点
     * 删除结点
     * 查找结点
     * 链表长度
     * 链表倒置
     * 链表排序（冒泡排序）
     */
    static Node head = new Node();

    public static void main(String[] args) throws Exception {
        LinkedListTest1 t = new LinkedListTest1();
        System.out.println(t.isEmpty());
        System.out.println("size:" + t.size());

        t.add(1);
        t.add(2);
        t.add(3);
        System.out.println(t.size());
        traverse();
        System.out.println(t.get(0));
        System.out.println(t.get(2));

        System.out.println(t.contains(1));
        System.out.println(t.contains(4));

        traverse();

        t.add(2, 99);
        traverse();

        System.out.println("remove: " + t.remove(3));
        traverse();
//        System.out.println(t.indexOf(111));
        System.out.println("removeInt: " + t.removeInt(99));
        traverse();
    }


    public boolean isEmpty() {
        return head.getNext() == null;
    }

    public int size() {
        int size = 0;
        Node temp = head.next;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public Integer get(int index) throws Exception {
        int size = size();
        if (index >= size) {
            throw new Exception("");
        }
        Node temp = head.next;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void add(Integer o) {
        Node newNode = new Node(o);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void add(int index, Integer element) throws Exception {
        Node newNode = new Node(element);
        int size = size();
        if (size <= index) {
            throw new Exception("数组下标越界 ");
        }
        Node temp = head.next;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;
    }

    public boolean contains(Integer o) {

        Node temp = head;
        do {
            temp = temp.next;
            if (temp.data == o) {
                return true;
            }
        } while (temp.next != null);
        return false;
    }

    public boolean removeInt(Integer o) throws Exception {
        Node temp = head.next;
        int index = 0;
        while (temp != null) {
            if (temp.data == o) {
                if (temp.next != null) {
                    //引用Node = Node结点
                    temp.next = temp.next.next;
                } else {
                    temp.next = null;
                }
                //删除对应下标的结点数据
                remove(index);
                return true;
            }
            temp = temp.next;
            index++;

        }
        return false;
    }

    public Object remove(int index) throws Exception {
        int size = size();
        if (index >= size) {
            throw new Exception();
        }
        Node temp = head;
        Node removeNode = null;
        //找到对应下标-1的node
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        //如果需要删除的结点为尾结点
        if (temp.next.next == null) {
            removeNode = temp.next;
            temp.next = null;
        } else {
            removeNode = temp.next;
            temp.next = temp.next.next;
        }
        return removeNode == null ? -1 : removeNode.getData();
    }

    public int indexOf(Integer o) {
        Node temp = head;
        int index = -1;
        while (temp.next != null) {
            if (temp.data == o) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    public static void traverse() {
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}