package com.xlccc.lbld;

public class Base1 {
    //线性迭代
    void traverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //迭代访问 arr[i]
        }
    }
    //链表遍历框架
    class ListNode{
        int val ;
        ListNode next;
    }
    void traverse(ListNode head){
        for (ListNode p = head; p!=null;p=p.next){
            //迭代访问p.val
        }
    }
    void traverse2(ListNode head){
        //递归访问 head.val
        traverse2(head.next);
    }
    //二叉树遍历框架，典型的非线性递归遍历结构
    class TreeNode{
        int val ;
        TreeNode left , right ;
    }
    void traverse(TreeNode root){
        traverse(root.left);
        traverse(root.right);
    }
    //由二叉树扩展为N叉树的遍历框架
    class TreeNode2{
        int val;
        TreeNode2[] children;
    }
    void traverse(TreeNode2 root){
        for (TreeNode2 child: root.children
             ) {
            traverse(child);
        }
    }

}
