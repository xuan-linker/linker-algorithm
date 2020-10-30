package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

/**
 * @author Linker
 * @date 2020/10/30 15:52
 * @description：基于数组实现的顺序栈
 */
public class ArrayStack {

    private String[] items; //数组
    private int count; //栈中元素的个数
    private int n; //栈的大小


    // 初始化数组，申请一个大小为n的数组空间

    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //入栈操作
    public boolean push(String item) {
        //如果栈满，则返回false
        if (n == count) {
            return false;
        }
        //入栈操作
        items[count++] = item;
//        count++;
        return true;
    }


    //出栈操作
    public String pop() {
        //如果栈为空
        if (count == 0) {
            return null;
        }
        String temp = items[--count];
        return temp;
    }

}
