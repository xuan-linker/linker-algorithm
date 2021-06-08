package com.xlccc.lee;

/**
 * @author Linker
 * @date 2021/3/11 16:15
 * @description：4. 寻找两个正序数组的中位数
 */
public class Demo4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] mergeNums = new int[len1 + len2];
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j]) {
                mergeNums[i + j] = nums1[i];
                i++;
            } else {
                mergeNums[i + j] = nums2[j];
                j++;
            }
        }
        while (i < len1) {
            mergeNums[i + j] = nums1[i];
            i++;
        }
        while (j < len2) {
            mergeNums[i + j] = nums2[j];
            j++;
        }

        int mergeNumsLength = mergeNums.length;
        if (mergeNumsLength == 0) {
            return -1;
        } else if (mergeNumsLength % 2 == 1) {
            return mergeNums[(int) mergeNumsLength / 2];
        } else if (mergeNumsLength % 2 == 0) {

            return (mergeNums[(int) (mergeNumsLength - 1) / 2] + mergeNums[mergeNumsLength / 2]) / 2.0;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        Demo4 d = new Demo4();
        double medianSortedArrays = d.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
