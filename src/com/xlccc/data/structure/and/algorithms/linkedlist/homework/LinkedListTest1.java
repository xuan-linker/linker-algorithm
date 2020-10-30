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
        t.add(4);
        t.add(6);
        t.add(7);
        t.add(7);
        t.add(7);
        t.add(2);
        t.add(3);
        System.out.println(t.size());
        traverse();
        System.out.println("--------------");
        System.out.println(t.get(0));
        System.out.println(t.get(2));

        System.out.println(t.contains(1));
        System.out.println(t.contains(4));

        traverse();
        System.out.println("--------------");

        t.add(2, 99);
        traverse();

        System.out.println("remove: " + t.remove(3));
        traverse();
//        System.out.println(t.indexOf(111));
        System.out.println("removeInt: " + t.removeInt(99));
        System.out.println("--------------");

        traverse();
        System.out.println("-------排序-------");
        t.sortLinkList();
        traverse();

        System.out.println("------链表反转--------");

//        head = reverseLinkedList(head);
//        head.next = temp;
//        System.out.println(head);
//        traverse();
        System.out.println("------链表反转2--------");
        Node node = reverseLinkedList2();
        head = node;
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

    public void sortLinkList() {
        //冒泡排序

        for (Node temp = head; temp != null; temp = temp.next) {
            for (Node nextTemp = temp; nextTemp != null; nextTemp = nextTemp.next) {
                if (nextTemp.data < temp.data) {
                    int tempData = nextTemp.data;
                    nextTemp.data = temp.data;
                    temp.data = tempData;
                }
            }
        }
    }


    /**
     * 反转链表
     * 1 2 3 4
     * 4 3 2 1
     *
     * @param node
     */
    public static Node reverseLinkedList(Node node) {
        Node prev;

        if (node == null || node.next == null) {
            prev = node;
        } else {
            //边界存在问题
            Node tmp = reverseLinkedList(node.next);
            System.out.println("tmp:" + tmp);
            node.next.next = node;
            node.next = null;
            prev = tmp;
        }
        return prev;
    }

    //https://juejin.im/post/6844904058562543623#heading-1

    /**
     * curr 旧结点
     * prev 存储新结点
     * nextTemp 暂存旧结点位置
     *
     * @return
     */
    public static Node reverseLinkedList2() {
//        Node prev = null;
//        Node curr = head;
//        while (curr != null) {
//            //暂时存储旧结点对应的下一个结点
//            Node nextTemp = curr.next;
//            //构造新结点，其中data不变，next为新队列
//            curr.next = prev;
//            //将新结点保存在新队列中
//            prev = curr;
//            //遍历下一个旧结点
//            curr = nextTemp;
//        }
//        return prev;

        Node prev = null;
        Node temp = head.next;
        while (temp != null) {
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
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

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}