package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

import java.util.Stack;

/**
 * @author Linker
 * @date 2020/10/30 16:14
 * @description：
 */
public class BrowserStack {
    private Stack<String> leftStack;

    private Stack<String> rightStack;

    public BrowserStack() {
        this.leftStack = new Stack<String>();
        this.rightStack = new Stack<String>();
    }

    /**
     * 前进
     *
     * @return
     */
    public String forward() {
        if (rightStack.empty()) {
            return null;
        }
        String peek = rightStack.peek();
        String pop = rightStack.pop();
        leftStack.push(pop);
        return peek;
    }


    /**
     * 后退
     *
     * @return
     */
    public String back() {
        if (leftStack.empty()) {
            return null;
        }
        String peek = leftStack.peek();

        String o = leftStack.pop();
        rightStack.push(o);

        return peek;
    }

    /**
     * 添加
     *
     * @param item
     * @return
     */
    public boolean add(String item) {
        //清空右侧栈
        if (!rightStack.empty()) {
            rightStack = new Stack<String>();
        }
        boolean res = leftStack.add(item);
        if (res) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BrowserStack{" +
                "leftStack=" + leftStack.toString() +
                ", rightStack=" + rightStack.toString() +
                '}';
    }
}
