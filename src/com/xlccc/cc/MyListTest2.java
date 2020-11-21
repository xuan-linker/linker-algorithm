package com.xlccc.cc;

/**
 * @author Linker
 * @date 2020/11/12 21:45
 * @description：
 */
public class MyListTest2 {
    public static void main(String[] args) {
        //insert test
//        MyStringList2.head = null;
        MyStringList2 list = new MyStringList2();
        list.insert("hello");
        list.insert("Hello");
        list.insert("HELLO");
        list.insert("1");
        SNode head = MyStringList2.head;
        while (head !=null){
            System.out.println(head.getData());
            head = head.getNextNode();
        }

    }
}
