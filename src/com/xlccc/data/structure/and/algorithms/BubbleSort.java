package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/2 21:09
 * @description：简单的冒泡排序
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -7, 4, 9, -6, 8, 10, 4};

        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
