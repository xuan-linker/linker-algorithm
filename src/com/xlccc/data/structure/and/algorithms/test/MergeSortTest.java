package com.xlccc.data.structure.and.algorithms.test;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/4 16:51
 * @description：归并排序
 */
public class MergeSortTest {
    //分
    public int[] sort(int[] sourceArr) {
        int[] arr = Arrays.copyOfRange(sourceArr, 0, sourceArr.length);

        //终止条件
        if (arr.length < 2) {
            return arr;
        }

        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    //合并
    protected int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] >= right[0]) {
                arr[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                arr[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while (left.length > 0) {
            arr[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            arr[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7};

        MergeSortTest ms = new MergeSortTest();
        int[] sort = ms.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

}
