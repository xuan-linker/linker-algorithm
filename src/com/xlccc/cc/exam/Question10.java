package com.xlccc.cc.exam;

import javax.lang.model.element.ElementKind;

/**
 * @author Linker
 * @description：
 */
public class Question10 {
    public class IntListNode {
        public int data;
        public IntListNode next;

        public IntListNode(int data) {
            this.data = data;
        }
    }

    public class IntList {
        private IntListNode head;
    }

    public IntList addToHead(int x) {
        IntListNode intListNode = new IntListNode(x);
        IntList intList = new IntList();
        intList.head = intListNode;
        return intList;
    }

    public boolean has(IntList list, int x) {
        if (list.head == null) {
            return false;
        }
        IntListNode nextNode = list.head;
        while (nextNode != null) {
            if (nextNode.data == x) {
                return true;
            }
            nextNode = nextNode.next;
        }
        return false;
    }

    public void remove(IntList list, int x) {
        //first delete
        if (list.head == null) {
            return;
        }
        IntListNode nextNode = list.head;
        if (nextNode.data == x) {
            list.head = null;
            return;
        }
        //fatherNode
        IntListNode node = null;
        //mid delete
        while (nextNode.next != null) {
            if (nextNode.data == x) {
                nextNode.next = nextNode.next.next;
                return;
            }
            node = nextNode;
            nextNode = nextNode.next;
        }
        //last delete
        if (nextNode.data == x) {
            node.next = null;
        }
    }

    public static void main(String[] args) {
        Question10 q = new Question10();
        IntList list = q.addToHead(10);
        System.out.println(list.head.data);
        boolean has = q.has(list, 10);
        System.out.println(has);
        boolean has1 = q.has(list, 11);
        System.out.println(has1);
        System.out.println("---Question12---");
        q.remove(list, 10);
        System.out.println((null == list.head));
    }
}
