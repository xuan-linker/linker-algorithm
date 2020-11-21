//package com.xlccc.cc.exam;
//
//import com.xlccc.data.structure.and.algorithms.linkedlist.homework.LinkedList;
//
///**
// * @author Linker
// * @date 2020/11/21 23:21
// * @description：
// */
//public class LinkedListCompareToArrays {
//    public static double dividend = 1000000000.0;
//    public static int length = 1000000;
//
//    /**
//     * insert
//     */
//    public static void LinkedListInsert() {
//        long startTime = System.nanoTime();
//
//        LinkedList list = new LinkedList();
//        for (int i = 0; i < length; i++) {
//            list.add(i);
//        }
//        long endTime = System.nanoTime();
//        System.out.println("LinkedList insert : " + (endTime - startTime) / dividend);
//    }
//
//    public static void ArraysInsert() {
//        long startTime = System.nanoTime();
//        int[] arr = new int[length];
//        for (int i = 0; i < length; i++) {
//            arr[i] = i;
//        }
//        long endTime = System.nanoTime();
//        System.out.println("Arrays insert : " + (endTime - startTime) / dividend);
//    }
//
//    /**
//     * remove
//     */
//    public static void LinkedListRemove() {
//        long startTime = System.nanoTime();
//
//    }
//
//    public static void ArraysRemove() {
//        long startTime = System.nanoTime();
//
//    }
//
//    public static void main(String[] args) {
//        LinkedListInsert();
//        ArraysInsert();
//    }
//}
