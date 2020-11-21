package com.xlccc.cc;

/**
 * @author Linker
 * @date 2020/11/12 21:44
 * @description：
 */
public class MyStringList2 implements StringList {

    public static SNode head ;

    @Override
    public void insert(String s) {
        SNode previousNode = head;
        SNode point = head;
        // 如果head为空，则链表为空，直接创建新节点
        if (head == null) {
            head = new SNode(s);
            //如果链表只有一个节点
        } else if (head.getNextNode() == null) {
            //若相等，则count++
            if (head.getData().compareTo(s) == 0) {
                head.increment();
                //若唯一的节点对应的data值小于s，则创建新节点并插入链表尾部
            } else if (head.getData().compareTo(s) < 0) {
                head.setNext(new SNode(s));
                //若唯一的节点对应的data值大于s，则创建新节点并插入链表前部
            } else {
                SNode temp = head;
                head = new SNode(s);
                head.setNext(temp);
            }
            //当链表中有多个节点
        } else {
            SNode node = new SNode(s);
            //直到最后一个节点或者节点的值s>point
            while (point.getNextNode() != null && point.getData().compareTo(s) < 0) {
                //point的父节点
                previousNode = point;
                //获取point下一个节点
                point = point.getNextNode();
            }
            if (point.getData().compareTo(s) == 0) {
                point.increment();
                //point指向最后一个节点，新节点插入尾部
            } else if (point.getData().compareTo(s) < 0) {
                point.setNext(node);
            } else {
                //如果头节点对应的不是point的父节点，（链表只有两个节点时）
                if (head != previousNode) {
                    previousNode.setNext(node);
                    node.setNext(point);
                } else {
                    SNode temp = head;
                    head = node;
                    node.setNext(temp);
                }
            }
        }
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public int findCount(String s) {
        return 0;
    }

    @Override
    public SNode firstNode() {
        return null;
    }
}
