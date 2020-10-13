package com.xlccc.sys;

/**
 * @author Linker
 * @date 2020/10/13 10:33
 * @description：线性查找
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 232, 4};

        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 111);
        System.out.println(res2);
    }
}
