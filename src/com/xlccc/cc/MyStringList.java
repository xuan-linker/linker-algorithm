package com.xlccc.cc;

/**
 * @author Linker
 * @date 2020/11/9 15:52
 * @description：LinkedList
 */
public class MyStringList implements StringList {

    public static SNode head = new SNode();

    /**
     * This function insert an item into linkedList ,
     * if list contain data of the same value, this count ++
     * else if add a new item into list.
     *
     * @param s
     */
    @Override
    public void insert(String s) {
        SNode next = head;
        while (null != next.getNextNode() && !next.getNextNode().getData().equals(s)) {
            next = next.getNextNode();
        }
        if (next.getNextNode() == null) {
            SNode newNode = new SNode(s);
            next.setNext(newNode);
        } else {
            //the item exist
            next.getNextNode().increment();
        }
    }

    /**
     * This delete an item from the list.
     * If list contain the item and this count > 1 , count--;
     * else if list contain the item and this count == 1 , delete this item;
     * else list just simply exit and not throw an exception or crash.
     *
     * @param s the String (i.e. item) to delete
     */
    @Override
    public void delete(String s) {
        SNode next = head;
        while (null != next.getNextNode() && !next.getNextNode().getData().equals(s)) {
            next = next.getNextNode();
        }
        if (next.getNextNode() == null) {
            return;
        } else if (next.getNextNode().getCount() > 1) {
            next.getNextNode().decrement();
        } else if (next.getNextNode().getCount() == 1) {
            next.setNext(next.getNextNode().getNextNode());
        }
    }

    /**
     * This function just find the count of the item,
     * if it's not exist , just exist return 0.
     *
     * @param s the String that we are looking for
     * @return count
     */
    @Override
    public int findCount(String s) {
        SNode next = head;
        while (next.getNextNode() != null && !next.getNextNode().getData().equals(s)) {
            next = next.getNextNode();
        }
        if (next.getNextNode() != null) {
            return next.getNextNode().getCount();
        }
        return 0;
    }

    /**
     * Get first node.
     *
     * @return first node
     */
    @Override
    public SNode firstNode() {
        return head.getNextNode();
    }

    /**
     * Traverse all data.
     *
     * @return all data
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyStringList : ");
        SNode next = head;
        while (null != next.getNextNode()) {
            sb.append(" [ data : ")
                    .append(next.getNextNode().getData())
                    .append(" ,count : ")
                    .append(next.getNextNode().getCount())
                    .append(" ] ");
            next = next.getNextNode();
        }
        return sb.toString();
    }
}
