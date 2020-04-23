package com.xlccc.basic;

/**
 * @Author Linker
 * @Date 2020/4/23 5:30 下午
 * @Version 1.0
 * TODO:最大子列和
 * 子列和为负数直接舍弃，重新开始计算,并将ThisSum重置
 */
public class MaxSubsequenceSum {

    public static void main(String[] args) {
        int[] arr = {1, -22, 32, -4, 5, 6};
        int returnMaxSum1 = MaxSubsequenceSum1(arr);
        int returnMaxSum2 = MaxSubsequenceSum2(arr);
        System.out.println(returnMaxSum1);
        System.out.println(returnMaxSum2);
    }

    public static int MaxSubsequenceSum1(int[] arr) {
        int ThisSum = 0, MaxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            ThisSum = 0 ;
            for (int j = i; j < arr.length; j++) {
                ThisSum += arr[j];
                if (ThisSum > MaxSum) {
                    MaxSum = ThisSum;
                }
            }
        }
        return MaxSum;
    }

    public static int MaxSubsequenceSum2(int[] arr) {
        int ThisSum = 0, MaxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            ThisSum += arr[i];
            if (ThisSum > MaxSum) {
                MaxSum = ThisSum;
            } else if (ThisSum < 0) {
                ThisSum = 0;
            }
        }
        return  MaxSum;
    }

}
