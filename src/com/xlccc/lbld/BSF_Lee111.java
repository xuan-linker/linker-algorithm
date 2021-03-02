package com.xlccc.lbld;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 齐头并进-第一次找到的终点就是最短的
 *
 * 遍历，定义起点和终点
 * 如果不符合终点定义，则将左右子项加入队列
 * 继续读取队列的第一个，进行判断
 * 直到找到第一个符合条件的
 */
public class BSF_Lee111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //起点root，终点target
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (q.size() > 0) {
            /*将当前队列中的所有节点向四周扩散*/
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
