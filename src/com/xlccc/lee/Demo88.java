package com.xlccc.lee;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/12/28 16:27
 * @description：88.合并两个有序数组
 */
public class Demo88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        System.arraycopy(nums2, 0, nums1, m, n);
//        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        System.out.println("Hello");
        Demo88 d = new Demo88();
        d.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
}
