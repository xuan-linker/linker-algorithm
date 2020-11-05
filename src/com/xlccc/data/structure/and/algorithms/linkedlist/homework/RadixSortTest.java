package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/11/5 22:33
 * @description：基数排序
 */
public class RadixSortTest {

    /**
     * 因为创建的[0,19]是从小到大的，所以组装后就是有序的
     *
     * @param sourceArray
     * @return
     */
    public int[] sort(int[] sourceArray) {
        //获取最大位数
        long maxNumber = getMaxNumber(sourceArray);
        int length = getNumberLength(maxNumber);
        //排列
        return radixSort(sourceArray, length);
    }

    //获取最大值
    private long getMaxNumber(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr
        ) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    //获取位数
    private int getNumberLength(long number) {
        if (number == 0) {
            return 1;
        }
        int length = 0;
        for (; number != 0; number /= 10) {
            length++;
        }
        return length;
    }

    private int[] radixSort(int[] arr, int maxDigit) {
        //初始化
        int mod = 10;
        int dev = 1;


        //遍历，从0->最高位 依次排序
        for (int i = 0; i < maxDigit; i++, mod *= 10, dev *= 10) {
            //创建tempArray存储，正数+负数=mod * 2; 例如比较个位[0-9-19]->十位[0-99-199]
            int[][] tempArray = new int[mod * 2][0];

            for (int j = 0; j < arr.length; j++) {
                //根据取余选择对应tempArray[]存储
                //例如 mod=10,dev=1;则比较个位，23%10=3，3/1=3, 3+10=13(因为正数[10-19])
                //mod=100,dev=10;则比较十位,233%100=33,33/10=3,3+100=103, 103为十位存放的桶
                int bucket = (arr[j] % mod / dev) + mod;
                tempArray[bucket] = appendArr(tempArray[bucket], arr[j]);
            }

            //重新拼装
            int pos = 0;
            for (int[] tempArr : tempArray
            ) {
                for (int value : tempArr
                ) {
                    arr[pos++] = value;
                }
            }
        }

        return arr;

    }

    private int[] appendArr(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

    public static void main(String[] args) {
        int[] sourceArr = {3, 11, 22112, 22165, 768, 2134, 11, 2, 1, -2, 1, -4, 5, -6, 7, -8, 9, -10};

        RadixSortTest rs = new RadixSortTest();
        int[] result = rs.sort(sourceArr);
        System.out.println(Arrays.toString(result));
    }

}
