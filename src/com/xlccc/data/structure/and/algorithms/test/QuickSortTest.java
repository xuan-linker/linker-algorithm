package com.xlccc.data.structure.and.algorithms.test;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/4 22:06
 * @description：快速排序
 */
public class QuickSortTest {
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

    public int[] sort(int[] sourceArr) {
        int[] arr = Arrays.copyOfRange(sourceArr, 0, sourceArr.length);
        return quickSort(arr, 0, arr.length);
    }

    public int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            //基准值
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    public int partition(int[] arr, int left, int right) {
        //将left设为基准值
        int p = left;
        int index = left + 1;
        for (int i = index; i < right; i++) {
            if (arr[i] < arr[p]) {
                swap(arr, i, index);
                index++;
            }
        }
        //最后将基准值交换到中心位置
        swap(arr, p, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        QuickSortTest qs = new QuickSortTest();
        int[] sort = qs.sort(arr);
        System.out.println(Arrays.toString(sort));

    }

}
