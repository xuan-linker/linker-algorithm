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

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            Arrays.sort(nums2);
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        for (int i = m - 1, j = n - 1; i >= 0 && j >= 0; ) {
            if (j >= 0 && nums2[j] >= nums1[i]) {
                nums1[i + j + 1] = nums2[j--];
            } else {
                nums1[i + j + 1] = nums1[i--];
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
//        int m = 3;
//        int n = 3;
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        System.out.println("Hello");
        Demo88 d = new Demo88();
        d.merge2(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
}
