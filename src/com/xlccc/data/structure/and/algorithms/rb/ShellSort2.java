package com.xlccc.data.structure.and.algorithms.rb;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/10/28 10:39
 * @description：希尔排序（ShellSort）
 */
public class ShellSort2 {

    public static <E extends Comparable> void sort(E[] arr) {
        /**
         *         gap = arr.length ,gap /= 2 , gap == 1 break
         *         i = gap ; i < arr.length ; i++
         *         插入排序
         *         j-gap >=0 && arr[j].compareTo(arr[j-gap])>0
         *
         *         swap(arr,j,j-gap)
         *         j-=gap
         */

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                //从gap个元素开始执行插入排序
                int j = i;
                while (j - gap >= 0 && arr[j].compareTo(arr[j - gap]) < 0) {
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    public static <E extends Comparable> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 4, 7, 5, 1};
        sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
