package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/4 15:33
 * @description：归并排序
 */
public class MergeSort {

    /**
     * 递归拆，全部拆完后，merge合并
     *
     * @param sourceArray
     * @return
     */
    public int[] sort(int[] sourceArray) {
        // 对arr进行拷贝， 不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 终止条件
        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    protected int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, 5, -6, 7};

        MergeSort ms = new MergeSort();
        int[] sort = ms.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

}
