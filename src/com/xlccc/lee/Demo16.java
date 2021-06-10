package com.xlccc.lee;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2021/3/18 11:46
 * @description：
 */
public class Demo16 {
    public int threeSumClosest(int[] nums, int target) {

        //sort
        Arrays.sort(nums);
        if (nums.length < 3) {
            return -1;
        }
        int point = nums[0]+nums[1]+nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;


            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(point - target) > Math.abs(sum - target)) {
                    point = sum;
                }
                if (target == sum) {
                    return sum;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return point;

    }


    public static void main(String[] args) {

    }
}
