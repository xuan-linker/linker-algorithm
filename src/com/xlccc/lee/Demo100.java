package com.xlccc.lee;

/**
 * @author Linker
 * @date 2021/1/4 19:32
 * @description：
 */
public class Demo100 {
    public static class TreeNode {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null)) {
            return false;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q == null) {

        } else if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            if ((p.left != null && q.left == null) || (p.left == null && q.left != null)) {
                return false;
            } else {
                if (isSameTree(p.left, q.left) == false) {
                    return false;
                }
            }
            if ((p.right != null && q.right == null) || (p.right == null && q.right != null)) {
                return false;
            } else {
                if (isSameTree(p.right, q.right) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);

        Demo100 d = new Demo100();
        boolean sameTree = d.isSameTree(p, q);
        System.out.println(sameTree);

    }
}
