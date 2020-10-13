package com.xlccc.sys.select.homework;

import com.xlccc.sys.select.ArrayGenerator;
import com.xlccc.sys.select.SortingHelper;

/**
 * @author Linker
 * @date 2020/10/13 17:24
 * @description：
 */
public class SelectionSort {

    public SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int minIndex = i;
            for (int j = i; j >= 0; j--) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateRandomArray(10, 10);
        SelectionSort.sort(arr);
        SortingHelper.sortTest("SelectionSort", arr);
    }
}
