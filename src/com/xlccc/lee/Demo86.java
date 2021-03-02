//package com.xlccc.lee;
//
///**
// * @author Linker
// * @date 2021/1/4 20:16
// * @description：
// */
//public class Demo86 {
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//    public ListNode partition(ListNode head, int x) {
//        ListNode pred = head;
//        while (pred != null) {
//            if (pred.val < x) {
//                pred = pred.next;
//            } else {
//                ListNode tempPred = head;
//                while (tempPred.val <= pred.val && tempPred.next.val < x) {
//                    tempPred = tempPred.next;
//                }
//            }
//        }
//    }
//
//    public void move(ListNode head, ListNode node) {
//        ListNode
//    }
//
//    public static void main(String[] args) {
//        //head = 1->4->3->2->5->2, x = 3
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(2);
//
//        Demo86 d = new Demo86();
//        d.partition(head, 3);
//
//
//    }
//}
