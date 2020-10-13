package com.xlccc.sys.select;

import java.util.Random;

/**
 * @author Linker
 * @date 2020/10/13 16:45
 * @description：
 */
public class ArrayGenerator {
    public ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * 生成一个长度为 n 的随机数组，每个数字的范围是 [0，bound)
     * [0,bound)
     *
     * @param n
     * @param bound 随机数上界
     * @return
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }

}
