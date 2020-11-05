package com.xlccc.data.structure.and.algorithms.test;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/5 13:31
 * @description：
 */
public class BucketSortTest {


    public int[] sort(int[] sourceArray, int bucketNumber) {
        int[] res = bucketSort(sourceArray, bucketNumber);
        return res;
    }


    public int[] bucketSort(int[] sourceArray, int bucketNumber) {

        //确定最大值最小值
        int maxNumber = sourceArray[0];
        int minNumber = sourceArray[0];
        for (int num : sourceArray
        ) {
            if (num > maxNumber) {
                maxNumber = num;
            } else if ((num < minNumber)) {
                minNumber = num;
            }
        }

        //根据最大最小值，预设的桶的个数确定桶的范围区间
        //二维数组暂存桶的数据
        //桶的数量 = （最大值 - 最小值）/ 预设数量 + 1;
        int bucketCount = (int) (Math.floor((maxNumber - minNumber) / bucketNumber) + 1);

        int[][] buckets = new int[bucketCount][0];
        //分配数据到桶中 (num - min ) / 预设桶量
        for (int i = 0; i < sourceArray.length; i++) {

            int index = (int) Math.floor((sourceArray[i] - minNumber) / bucketNumber);
            buckets[index] = appendArr(buckets[index], sourceArray[i]);
        }

        int[] resultArr = new int[0];

        //拼接
        for (int[] arr : buckets
        ) {
            insertSort(arr);
            resultArr = appendArrays(resultArr, arr);
        }
        //test
        for (int[] arr : buckets
        ) {
            System.out.println(Arrays.toString(arr));
        }
        return resultArr;

    }

    //自动扩容
    public int[] appendArr(int[] tempArr, int number) {
        tempArr = Arrays.copyOf(tempArr, tempArr.length + 1);
        tempArr[tempArr.length - 1] = number;
        return tempArr;
    }

    public int[] appendArrays(int[] arr, int[] tempArr) {
        int len = arr.length;
        arr = Arrays.copyOf(arr, len + tempArr.length);
        for (int i = 0; i < tempArr.length; i++) {
            arr[len + i] = tempArr[i];
        }
        return arr;
    }

    public void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j >= 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = arr[j];
    }

    public static void main(String[] args) {
        int[] sourceArr = {1, -2, 3, -4, 5, -6, 7, -8};
        BucketSortTest bs = new BucketSortTest();
        int bucketSize = 2;
        int[] result = bs.sort(sourceArr, bucketSize);
        System.out.println("原始数据: " + Arrays.toString(sourceArr) + "\n 桶数量: " + bucketSize + " \n 结果: " + Arrays.toString(result));

    }
}
