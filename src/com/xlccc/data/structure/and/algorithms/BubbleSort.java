package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/2 21:09
 * @description：简单的冒泡排序
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

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

    public static int[] bubbleSort2(int[] arr, int n) {
        if (n <= 1) {
            return arr;
        }

        for (int i = 0; i < n; i++) {
            //提前退出冒泡排序标志
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }

            }
            if (!flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -7, 4, 9, -6, 8, 10, 4};

//        int[] result = bubbleSort(arr);
        int[] result = bubbleSort2(arr, arr.length);
        System.out.println(Arrays.toString(result));


    }
}
