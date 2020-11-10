package com.xlccc.data.structure.and.algorithms.tree;

/**
 * @author Linker
 * @date 2020/11/10 16:51
 * @description：遍历二叉树
 */
public class BinarySearchTree {
    /**
     * 前、中、后遍历二叉树
     * void preOrder(Node root) {
     * if (root == null) {
     * return;
     * }
     * print root;
     * preOrder(root -> left);
     * preOrder(root -> right);
     * }
     * <p>
     * void inOrder(Node root) {
     * if (root == null) {
     * return;
     * }
     * inOrder(root -> left);
     * print root;
     * inOrder(root -> right);
     * }
     * <p>
     * void postOrder(Node root) {
     * if (root == null) {
     * return;
     * }
     * postOrder(root -> left);
     * postOrder(root -> right);
     * print root;
     * }
     * <p>
     * 层序遍历二叉树
     */
    private Node tree;

    public Node find(int data) {
        Node p = tree;
        while (p != null) {
            if (data < p.data) {
                p = p.left;
            } else if (data > p.data) {
                p = p.right;
            } else {
                return p;
            }
        }
        return null;
    }

    /**
     * 插入按照左左，右右，循环判断，直到待插入位置为空
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
                }
                p = p.right;
            } else {
                //data < p.data
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }

    /**
     * 1.删除的结点没有子节点，直接将其父节点指向要删除结点的指针置为null。
     * 2.删除的结点只有一个子节点（只有左子结点或者右子结点），更新父节点中，指向要删除节点的指针，让它指向要删除节点的子节点即可。
     * 3.如果删除节点有两个子节点。
     * 找到这个节点的右子树的最小节点，将其替换到要删除的节点上。
     * 然后再删除这个最小节点，因为最小节点没有左子节点（如果有左子节点，那就不是最小节点了）
     */

    public void delete(int data) {
        Node p = tree; // p 指向要删除的节点，初始化指向根节点
        Node pp = null; // pp 记录的是 p 的父节点
        while (p != null && p.data != data) {
            pp = p;
            if (data > p.data)
                p = p.right;
            else
                p = p.left;
        }
        if (p == null)
            return;  // 没有找到

        //要删除的节点有两个子节点
        if (p.left != null && p.right != null) { // 查找右子树中最小节点
            Node minP = p.right;
            Node minPP = p; // minPP 表示 minP 的父节点
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            p.data = minP.data; // 将 minP 的数据替换到 p 中
            p = minP; // 下面就变成了删除 minP 了
            pp = minPP;
        }

        //删除节点是叶子节点或者仅有一个子节点
        Node child; // p 的子节点
        if (p.left != null)
            child = p.left;
        else if (p.right != null)
            child = p.right;
        else
            child = null;

        if (pp == null)
            tree = child; // 删除的是根节点
        else if (pp.left == p)
            pp.left = child;
        else
            pp.right = child;
    }


    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);

        Node node = bst.find(3);
        System.out.println(node.data);

        bst.delete(3);
    }
}
