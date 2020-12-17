package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/16 23:45
 * @description： 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 */
public class Demo2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next
        ) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode head = null;
        int tempValue = 0;
        while (l1 != null || l2 != null || tempValue != 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + tempValue;
            if (l3 == null) {
                //init
                l3 = new ListNode(sum % 10);
                head = l3;
            } else {
                l3.next = new ListNode(sum % 10);
                l3 = l3.next;
            }
            tempValue = (int) sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }


    public ListNode newNode(int number) {
        ListNode l = null;
        ListNode head = null;
        if (number == 0) {
            return new ListNode(0);
        }
        while ((int) number / 10 > 0) {
            if (l == null) {
                l = new ListNode(number % 10);
                number = (number - number % 10) / 10;
                head = l;
            } else {
                l.next = new ListNode(number % 10);
                number = (number - number % 10) / 10;
                l = l.next;
            }
        }
        l.next = new ListNode(number % 10);
        return head;
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        ListNode listNode1 = d.newNode(9999999);
        ListNode listNode2 = d.newNode(9999);

        ListNode listNode = d.addTwoNumbers(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
