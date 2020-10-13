package com.xlccc.sys.line;

/**
 * @author Linker
 * @date 2020/10/13 15:22
 * @description：
 */
public class ArrayGenerator {
    public ArrayGenerator() {
    }

    public static Integer[] generatorOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
