package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/4 17:38
 * @description：快速排序
 */
public class QuickSort {
    /**
     * 将左边第一个设为基准值
     * 如果比基准值小，则放在左边 -> arr[] => {基准值，比基准值小，比基准值大}
     * 交换 => {比基准值小（无序），基准值，比基准值大}
     * 返回基准值对应下标 => partitionIndex
     * <p>
     * quickSort(left,partitionIndex-1)
     * quickSort(partitionIndex+1,right)
     * <p>
     * left == right 或者 left > right 说明以及排序完成
     */

    public int[] sort(int[] sourceArray) {
        //对arr进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    /**
     * 交换
     *
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, 5, -6, 7};

        QuickSort qs = new QuickSort();

        int[] sort = qs.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

}
