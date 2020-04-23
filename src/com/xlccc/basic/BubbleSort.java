package com.xlccc.basic;

/**
 * @Author Linker
 * @Date 2020/4/23 3:13 下午
 * @Version 1.0
 * TODO:冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -7, 4, 9, -6, 8, 10, 4};
        bubbleSort(arr);
        for (int a : arr
        ) {
            System.out.print(a+"\t");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}


