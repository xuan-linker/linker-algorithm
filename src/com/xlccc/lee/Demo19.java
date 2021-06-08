package com.xlccc.lee;

/**
 * @author Linker
 * @date 2021/1/7 22:21
 * @description：
 */
public class Demo19 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //get length
        int count = 0;
        ListNode pred = head;
        while (pred != null) {
            count++;
            pred = pred.next;
        }
        ListNode root = head;
        ListNode tempBefore = null;
        for (int i = 1; i < count - n + 1; i++) {
            tempBefore = root;
            root = root.next;
        }
        tempBefore.next = tempBefore.next.next;
        return head;
    }
//    //双指针
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        ListNode result = head;
//        ListNode first = null;
//        ListNode second = null;
//        ListNode tempBefore = null;
//
//        for (int i = 0; i < n-1; i++) {
//            if (i == 0) {
//                first = head;
//            } else {
//                first = first.next;
//            }
//        }
//        while (first.next != null) {
//            first = first.next;
//            tempBefore = second;
//            if (second == null) {
//                second = head;
//            } else {
//                second = second.next;
//            }
//        }
//        tempBefore.next = tempBefore.next.next;
//
//        return result;
//
//    }


    public static void main(String[] args) {
//        ListNode root = new ListNode(1);
//        root.next = new ListNode(2);
//        root.next.next = new ListNode(3);
//        root.next.next.next = new ListNode(4);
//        root.next.next.next.next = new ListNode(5);

        ListNode root = new ListNode(1);

        Demo19 d = new Demo19();
//        ListNode listNode = d.removeNthFromEnd(root, 2);
        ListNode listNode = d.removeNthFromEnd(root, 1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
