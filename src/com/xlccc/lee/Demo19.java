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
        for (int i = 1; i < count - n + 1; i++) {
            root = root.next;
        }
        root.next= root.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        Demo19 d = new Demo19();
        d.removeNthFromEnd(root, 2);
        System.out.println("Hello");
    }
}
