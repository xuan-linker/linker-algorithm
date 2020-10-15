package com.xlccc.sys.select.homework;

import com.xlccc.sys.select.ArrayGenerator;
import com.xlccc.sys.select.SortingHelper;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/10/15 16:28
 * @description：
 */
public class InsertionSort {
    public InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j + 1 <= arr.length - 1 && arr[j].compareTo(arr[j + 1]) > 0; j++) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int j;
            E t;
            for (j = i, t = arr[j]; j + 1 <= arr.length - 1 && t.compareTo(arr[j + 1]) > 0; j++) {
                arr[j ] = arr[j+ 1];

                System.out.println(Arrays.toString(arr));

            }

            arr[j] = t;
            System.out.println(Arrays.toString(arr));

        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int[] dataSize = {10, 20};
        for (int n : dataSize
        ) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("InsertionSort4", arr);
        }
    }
}
