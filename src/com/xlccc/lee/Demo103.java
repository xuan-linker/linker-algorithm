package com.xlccc.lee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Linker
 * @date 2020/12/22 10:14
 * @description：103. 二叉树的锯齿形层序遍历
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Demo103 {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        int plies = 0;
        List<List<Integer>> varArr = new ArrayList<>();
        traverseNode(root, plies, varArr);

        for (int i = 0; i < varArr.size(); i++) {
            if (i % 2 == 1) {
                List<Integer> list = varArr.get(i);
                Collections.reverse(list);
            }
        }
        return varArr;
    }

    /**
     * @param treeNode
     * @param plies
     * @return
     */
    TreeNode traverseNode(TreeNode treeNode, int plies, List<List<Integer>> varArr) {
        if (treeNode != null) {
            if (varArr.size() > plies) {
                List<Integer> integers = varArr.get(plies);
                integers.add(treeNode.val);
            } else {
                List<Integer> integerList = new ArrayList<>();
                integerList.add(treeNode.val);
                varArr.add(plies, integerList);
            }
        }
        int nextPlies = plies + 1;
        if (treeNode.left != null) {
            traverseNode(treeNode.left, nextPlies, varArr);
        }
        if (treeNode.right != null) {
            traverseNode(treeNode.right, nextPlies, varArr);
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Demo103 d = new Demo103();
        List<List<Integer>> lists = d.zigzagLevelOrder(root);
        for (List<Integer> list : lists
        ) {
            for (Integer i : list
            ) {
                System.out.printf("I : " + i);
            }
            System.out.println(" --- ");

        }


    }
}
