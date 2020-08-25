package com.xlccc.data.structure.and.algorithms;

/**
 * @author linker
 * @version 1.0
 * @date 2020/8/24 23:13
 * @description:单向链表 https://www.cnblogs.com/Java3y/p/8664874.html
 */
public class BaseLinkedList {
    static Node head = new Node();

    public static void main(String[] args) {

        traverse(head);
        System.out.println("length:" + linkListLength(head));

        Node temp = head;

        addData(6);
        addData(2);
        addData(2);
        addData(2);
        addData(3);
        addData(4);
        addData(5);

        traverse(head);
        System.out.println("length:" + linkListLength(head));

        System.out.println("---插入----");
        insertNode(head, 2, 8);
        traverse(head);

        System.out.println("---删除----");
        deleteNode(head, 2);
        traverse(head);

        System.out.println("---排序----");
        sortLinkList(head);
        traverse(head);

        System.out.println("---删除重复数据---");
        deleteDuplecate(head);
        traverse(head);

        System.out.println("---反转链表---");
        reverseLinkedList(head);
        traverse(head);
    }

    /**
     * 增加数据
     *
     * @param value
     */
    public static void addData(int value) {
        //初始化需要加入的节点
        Node newNode = new Node(value);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * 遍历链表
     *
     * @param head
     */
    public static void traverse(Node head) {
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * 链表长度
     *
     * @param head
     * @return
     */
    public static int linkListLength(Node head) {
        int length = 0;
        //临时节点，从首节点开始
        Node temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void insertNode(Node head, int index, int value) {
        if (index < 1 || index > linkListLength(head)) {
            System.out.println("Index Error");
            return;
        }

        Node temp = head;

        int currentPos = 0;

        Node insertNode = new Node(value);

        while (temp.next != null) {
            if (currentPos == (index - 1)) {
                insertNode.next = temp.next;
                temp.next = insertNode;
                return;
            }
            currentPos++;
            temp = temp.next;
        }
    }

    public static void deleteNode(Node head, int index) {
        if (index < 1 || index > linkListLength(head)) {
            System.out.println("Index Error");
            return;
        }
        int currentPos = 0;
        Node temp = head;
        while (temp.next != null) {
            if (currentPos == (index - 1)) {
                temp.next = temp.next.next;
            }
            currentPos++;
            temp = temp.next;
        }
    }

    /**
     * 冒泡排序
     *
     * @param head
     */
    public static void sortLinkList(Node head) {

        Node currentNode;
        Node nextNode;
        for (currentNode = head; currentNode.next != null; currentNode = currentNode.next) {
            for (nextNode = currentNode; nextNode.next != null; nextNode = nextNode.next) {
                if (nextNode.data > nextNode.next.data) {
                    int tempDate = nextNode.data;
                    nextNode.data = nextNode.next.data;
                    nextNode.next.data = tempDate;
                }
            }
        }
        return;
    }

    /**
     * 删除重复数据
     *
     * @param head
     */
    public static void deleteDuplecate(Node head) {
        Node temp = head;
        Node nextNode = temp.next;
        while (temp.next != null) {
            while (nextNode.next != null) {
                if (nextNode.next.data == nextNode.data) {
                    nextNode.next = nextNode.next.next;
                } else {
                    nextNode = nextNode.next;
                }
            }
            temp = temp.next;
        }
    }

    public static Node reverseLinkedList(Node node) {
        Node preV;
        if (node.next == null || node == null) {
            preV = node;
        } else {
            Node temp = reverseLinkedList(node.next);
            node.next.next=node;
            node.next=null;
            preV=temp;
        }
        return preV;
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

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}


