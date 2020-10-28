package com.xlccc.data.structure.and.algorithms.rb;

/**
 * @author Linker
 * @date 2020/10/28 10:26
 * @description：插入排序(InsertionSort)
 **/
public class InsertionSort2 {
    /**
     * 从小到大排序
     * 简单 双层循环 平均时间复杂度O(n^2) 空间复杂度O(1)
     * 最优:O(n) 即1，2，3，4，5 if判断时break
     * 最坏:O(n^2) 5，4，3，2，1 循环时依次交换
     */

    public static <E extends Comparable> void sort2(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 4, 7, 5, 1};

        sort2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
