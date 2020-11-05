package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/4 22:28
 * @description：桶排序
 */
public class BucketSort {
    /**
     * 确定最大、最小值
     * 确定桶数量
     * 将数据分配到桶中
     */

    public int[] sort(int[] sourceArray, int bucketSize) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return bucketSort(arr, bucketSize);
    }

    private int[] bucketSort(int[] arr, int bucketSize) {
        if (arr.length == 0) {
            return arr;
        }

        int minValue = arr[0];
        int maxValue = arr[0];

        for (int value : arr
        ) {
            if (value < minValue) {
                minValue = value;
            } else if (value > maxValue) {
                maxValue = value;
            }
        }

        /**
         * 保存精度的问题
         * 桶的数量太大，会造成排序问题
         * 对每个桶内数据排序
         */
        int bucketCount = (int) (Math.floor((maxValue - minValue) / bucketSize) + 1);

        int[][] buckets = new int[bucketCount][0];

        //利用映射函数将数据分配到各个桶中
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.floor(arr[i] - minValue) / bucketSize);
            buckets[index] = arrAppend(buckets[index], arr[i]);
        }

        int arrIndex = 0;
        for (int[] bucket : buckets
        ) {
            if (bucket.length <= 0) {
                continue;
            }
            //对每个桶进行排序，这里使用了插入排序
//            bucket = insertSort.sort(bucket);
            bucket = insertSort(bucket);
            for (int value : bucket
            ) {
                arr[arrIndex++] = value;
            }
        }
        return arr;
    }

    private int[] arrAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

    private int[] insertSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
    }

    public static void main(String[] args) {
        int[] sourceArr = {1, -2, 3, -4, 5, -6, 7, -8};
        BucketSort bs = new BucketSort();
        int bucketSize = 2;
        int[] result = bs.sort(sourceArr, bucketSize);
        System.out.println("原始数据: " + Arrays.toString(sourceArr) + "\n 桶数量: " + bucketSize + " \n 结果: " + Arrays.toString(result));

        System.out.println("------------");
        int bucketSize2 = 5;
        int[] result2 = bs.sort(sourceArr, bucketSize2);
        System.out.println("原始数据: " + Arrays.toString(sourceArr) + "\n 桶数量: " + bucketSize2 + " \n 结果: " + Arrays.toString(result2));

    }


}
