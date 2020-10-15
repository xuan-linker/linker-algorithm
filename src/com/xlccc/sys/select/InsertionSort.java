package com.xlccc.sys.select;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/10/15 15:10
 * @description：插入排序算法
 */
public class InsertionSort {
    public InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {

            //将 arr[i] 插入到合适的位置
//            for (int j = i; j - 1 >= 0; j--) {
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }
            /**
             * 同时判断 ，每次判断后直接交换
             */
            for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    /**
     * 2,4,3,5,1
     * 2,3,3,5,1
     * 2,3,4,5,1
     * 2,3,4,1,1
     * 2,3,4,5,1
     * 2,3,4,5,1
     *
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            /**
             * 判断，赋值，最后一次交换
             */
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;

            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));

    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int[] dataSize = {10000, 100000};
        for (int n : dataSize
        ) {
//            System.out.println("Random array: ");
//            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
//            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
//            Integer[] arr3 = Arrays.copyOf(arr, arr.length);
//
//            SortingHelper.sortTest("SelectionSort", arr);
//            SortingHelper.sortTest("InsertionSort", arr2);
////            SortingHelper.sortTest("InsertionSort2", arr3);
//
//            System.out.println("Ordered :");
//
//            arr2= Arrays.copyOf(arr, arr.length);
//            SortingHelper.sortTest("SelectionSort", arr);
//            SortingHelper.sortTest("InsertionSort", arr2);
            Integer[] arr = new Integer[]{2, 4, 3, 5, 1};
            SortingHelper.sortTest("InsertionSort2", arr);
        }
    }
}
