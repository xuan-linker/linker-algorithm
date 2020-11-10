package com.xlccc.data.structure.and.algorithms.tree;

/**
 * @author Linker
 * @date 2020/11/10 16:48
 * @description：
 */
public class Node {

    private Node left;
    private String data;
    private Node right;

    public Node(Node left, String data, Node right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public Node(String data) {
        this.data = data;
    }

    public Node() {
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
