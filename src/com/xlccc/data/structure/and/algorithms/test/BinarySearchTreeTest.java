package com.xlccc.data.structure.and.algorithms.test;

/**
 * @author Linker
 * @date 2020/11/10 22:49
 * @description：二叉树
 */
public class BinarySearchTreeTest {


    private Node tree;

    public Node find(int data) {
        Node p = tree;
        while (p != null) {
            if (data > p.data) {
                p = p.right;
            } else if (data < p.data) {
                p = p.left;
            } else {
                return p;
            }
        }
        return null;
    }

    /**
     * 前提，此二叉树数据不重复
     *
     * @param data
     */
    public void insert(int data) {
        if (tree == null) {
            tree = new Node(data);
        }

        Node p = tree;
        while (p != null) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                } else {
                    p = p.right;
                }
            } else if (data < p.data) {
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                } else {
                    p = p.left;
                }
            }
        }
    }

    public void delete(int data) {
        Node p = tree; // 指向要删除的节点，初始化指向根节点
        Node pp = null; // pp 记录的是父节点

        //p -> data
        while (p != null && p.data != data) {
            pp = p;
            if (data > p.data) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        if (p == null) {
            return; // can't find
        }


        //要删除的节点有两个子节点
        if (p.left != null && p.right != null) { // 查找右子树中最小节点
            Node minP = p.right;
            Node minPP = p; // minPP 表示 minP 的父节点
            /*
              3.如果删除节点有两个子节点。
              找到这个节点的右子树的最小节点，将其替换到要删除的节点上。
              然后再删除这个最小节点，因为最小节点没有左子节点（如果有左子节点，那就不是最小节点了）
            */
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            p.data = minP.data;
            p = minP;
            pp = minPP;

        }


        //要删除的节点有一个子节点
        Node child; // p的子节点
        if (p.left != null) {
            child = p.left;
        } else if (p.right != null) {
            child = p.right;
        } else {
            child = null;
        }

        //要删除的节点没有子节点
//        if (p.left == null && p.right == null) {
//
//        }
        if (pp == null) {
            tree = child; // 删除的是根节点
        } else if (pp.left == p) {
            pp.left = child;
        } else {
            pp.right = child;
        }

    }


    /**
     * 节点
     */
    public static class Node {
        private Node left;
        private Node right;
        private int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
