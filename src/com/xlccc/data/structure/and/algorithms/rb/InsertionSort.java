package com.xlccc.data.structure.and.algorithms.rb;

/**
 * @author Linker
 * @date 2020/10/28 10:10
 * @description：插入排序
 */
public class InsertionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 5, 1};

        int[] arrResult = sort(arr);
        for (int i = 0; i < arrResult.length; i++) {
            System.out.println(arrResult[i]);
        }
    }
}
