package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/5 15:02
 * @description：基数排序
 */
public class RadixSort {

    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        //最大位数
        int maxDigit = getMaxDigit(arr);

        int[] result = radixSort(arr, maxDigit);
        return result;
    }

    //获取最大值的位数
    public int getMaxDigit(int[] arr) {
        int maxValue = getMaxValue(arr);
        return getNumLength(maxValue);
    }

    //获取最大值
    public int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr
        ) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //获取最大位数
    protected int getNumLength(long num) {
        if (num == 0) {
            return 1;
        }
        int length = 0;

        for (long temp = num; temp != 0; temp /= 10) {
            length++;
        }
        return length;
    }

    private int[] radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;

        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
            //考虑负数的情况，这里扩展一倍队列数，其中[0-9]对应负数，[10-19]对应正数(bucket + 10)
            int[][] counter = new int[mod * 2][0];

            for (int j = 0; j < arr.length; j++) {
                //例如 11%10 =1 ->  1/1 = 1 => 1+10 = 11 (因为正数+10);
                //
                int bucket = ((arr[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket], arr[j]);
            }

            //
            int pos = 0;
            for (int[] bucket : counter
            ) {
                for (int value : bucket
                ) {
                    arr[pos++] = value;
                }
            }
        }
        return arr;
    }

    private int[] arrayAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

    public static void main(String[] args) {
        int[] sourceArr = {3, 11, 22112, 22165, 768, 2134, 11, 2, 1, -2, 1, -4, 5, -6, 7, -8, 9, -10};

        RadixSort rs = new RadixSort();
        int[] result = rs.sort(sourceArr);
        System.out.println(Arrays.toString(result));
    }


}
