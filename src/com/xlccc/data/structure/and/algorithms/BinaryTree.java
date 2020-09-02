package com.xlccc.data.structure.and.algorithms;

import java.util.Stack;

/**
 * @author Linker
 * @date 2020/9/2 20:56
 * @description：二叉树的原理及Java实现
 */
public class BinaryTree {

    /**
     * 二叉树的节点数据结构
     */
    private class TreeNode {
        /**
         * 序号
         */
        private int key = 0;
        /**
         * 值
         */
        private String data = null;

        private boolean isVisited = false;

        /**
         * 左儿子节点
         */
        private TreeNode leftChild = null;
        /**
         * 右儿子节点
         */
        private TreeNode rightChild = null;

        /**
         * 默认构造
         */
        public TreeNode() {
        }

        /**
         * @param key  层序编码
         * @param data 数据域
         */
        public TreeNode(int key, String data) {
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    private TreeNode root = null;

    public BinaryTree() {
        root = new TreeNode(1, "rootNode(A)");
    }

    /**
     * 创建一二叉树
     * <pre>
     *       A
     *   B       C
     * D   E        F
     * </pre>
     */
    public void createBinTree(TreeNode root) {
        TreeNode treeNodeB = new TreeNode(2, "B");
        TreeNode treeNodeC = new TreeNode(3, "C");
        TreeNode treeNodeD = new TreeNode(4, "D");
        TreeNode treeNodeE = new TreeNode(5, "E");
        TreeNode treeNodeF = new TreeNode(6, "F");

        treeNodeC.rightChild = treeNodeF;

        treeNodeB.leftChild = treeNodeD;
        treeNodeB.rightChild = treeNodeE;

        root.leftChild = treeNodeB;
        root.rightChild = treeNodeC;
    }

    /**
     * 判断根节点是否为空
     *
     * @return 返回根节点是否为空
     */
    public boolean isEmpty() {
        return root == null;
    }

    //数的高度
    public int height() {
        return height(root);
    }

    //节点个数
    public int size() {
        return size(root);
    }

    /**
     * 计算二叉树节点高度
     *
     * @param subTree
     * @return
     */
    private int height(TreeNode subTree) {
        if (subTree == null) {
            return 0; //递归结束，树的高度为0
        } else {
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);
            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    /**
     * 计算节点大小
     *
     * @param subTree 节点
     * @return 节点大小
     */
    private int size(TreeNode subTree) {
        if (subTree == null) {
            return 0;
        } else {
            return 1 + size(subTree.leftChild) + size(subTree.rightChild);
        }
    }

    //返回双亲节点
    public TreeNode parent(TreeNode element) {
        return (root == null || root == element) ? null : parent(root, element);
    }

    public TreeNode parent(TreeNode subTree, TreeNode element) {
        if (subTree == null) {
            return null;
        }
        if (subTree.leftChild == element || subTree.rightChild == element) {
            //返回父节点地址
            return subTree;
        }
        TreeNode p;
        //现在左子树中找，如果没有找到，才到右子树中找
        if ((p = parent(subTree.leftChild, element)) != null)
            //递归在左子树中找
            return p;
        else
            //递归在右子树中找
            return parent(subTree.rightChild, element);
    }

    public TreeNode getLeftChildNode(TreeNode element) {
        return (element != null) ? element.leftChild : null;
    }

    public TreeNode getRightChildNode(TreeNode element) {
        return (element != null) ? element.rightChild : null;
    }

    public TreeNode getRoot() {
        return root;
    }

    /**
     * 在释放某个节点时，该节点的左右子树都已经释放，
     * 所以应该采用后序遍历，当访问某个结点时将该结点的存储空间释放
     */
    public void destroy(TreeNode subTree) {
        //删除根为subTree的子树
        if (subTree != null) {
            destroy(subTree.leftChild);
            destroy(subTree.rightChild);
            subTree = null;
        }
    }

    public void traverse(TreeNode subTree) {
        System.out.println("key:" + subTree.key + "--name:" + subTree.data);
        traverse(subTree.leftChild);
        traverse(subTree.rightChild);
    }

    //前序遍历
    public void preOrder(TreeNode subTree) {
        if (subTree != null) {
            visted(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    //中序遍历
    public void inOrder(TreeNode subTree) {
        if (subTree != null) {
            inOrder(subTree.leftChild);
            visted(subTree);
            inOrder(subTree.rightChild);
        }
    }

    public void postOrder(TreeNode subTree) {
        if (subTree != null) {
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            visted(subTree);
        }
    }

    //前序遍历的非递归实现
    public void nonRecPreOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = p;
        while (node != null || stack.size() > 0) {
            while (node != null) {
                visted(node);
                stack.push(node);
                node = node.leftChild;
            }
            while (stack.size() > 0) {
                node = stack.pop();
                node = node.rightChild;

                //
                if (node != null && stack.size() >= 1) {
                    if (null == node.leftChild && null == node.rightChild) {
                        visted(node);
                    }
                }
            }
        }
    }

    //    //中序遍历的非递归实现
    public void nonRecInOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = p;
        while (node != null || stack.size() > 0) {
            //存在左子树
            while (node != null) {
                //一直到左子树为null
                stack.push(node);
                node = node.leftChild;
            }
            //栈非空
            if (stack.size() > 0) {
                //先弹出null再读取
                node = stack.pop();
                visted(node);
                node = node.rightChild;
            }
        }
    }

    //后序遍历
    public void noRecPostOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = p;
        while (p != null) {
            //左子树入栈
            while (p.leftChild != null) {
                stack.push(p);
                p = p.leftChild;
            }
            //当前结点无右子树或右子树已经输出
            while (p != null && (p.rightChild == null || p.rightChild == node)) {
                visted(p);
                node = p;
                if (stack.empty()) {
                    return;
                }
                p = stack.pop();
            }
            stack.push(p);
            p = p.rightChild;

        }
    }


    public void visted(TreeNode subTree) {
        subTree.isVisited = true;
        System.out.println("key:" + subTree.key + "--name:" + subTree.data);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinTree(bt.root);

        System.out.println("the size of the tree is :" + bt.size());
        System.out.println("the height of the tree is :" + bt.height());

        System.out.println("-----前序遍历[ABDECF]-----");
        bt.preOrder(bt.root);

        System.out.println("-----中序遍历[DBEACF]-----");
        bt.inOrder(bt.root);

        System.out.println("-----后序遍历[DEBFCA]-----");
        bt.postOrder(bt.root);

        System.out.println("--非递归实现---前序遍历[ABDECF]---");
        bt.nonRecPreOrder(bt.root);

        System.out.println("--非递归实现---中序遍历[DBEACF]-----");
        bt.nonRecInOrder(bt.root);

        System.out.println("--非递归实现---后序遍历[DEBFCA]-----");
        bt.noRecPostOrder(bt.root);
    }
}
