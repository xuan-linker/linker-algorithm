package com.xlccc.lee;

/**
 * @author Linker
 * @date 2021/3/30 8:48
 * @description：
 */
class ListNode {
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

public class Demo19_2 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head, right = head;
        if (head == null) {
            return new ListNode();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                continue;
            } else if (right.next != null) {
                right = right.next;
            } else if (right.next == null) {
                //超过数量限制
                return head;
            }
        }

        int flag = 0;
        ListNode result = left;
        if (flag == 0 && right.next == null){
            return new ListNode();
        }
        while (right.next != null) {

            if (flag != 0) {
                left = left.next;
            }
            right = right.next;
            if (right.next == null) {
                left.next = left.next.next;
            }
            flag++;

        }
        return result;
    }

    public static void main(String[] args) {
        Demo19_2 d = new Demo19_2();

//        ListNode root = new ListNode(1);
//        root.next = new ListNode(2);
//        root.next.next = new ListNode(3);
//        root.next.next.next = new ListNode(4);
//        root.next.next.next.next = new ListNode(5);
//
//
//        ListNode listNode = d.removeNthFromEnd(root, 2);

        ListNode root = new ListNode(1);
        ListNode listNode = d.removeNthFromEnd(root, 1);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
