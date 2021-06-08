package com.xlccc.lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Linker
 * @date 2021/3/18 10:48
 * @description：
 */
public class Demo15 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length <= 2) {
            return result;
        }
        Arrays.sort(nums);  //O(nlogn)

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            //去重
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                //去重
                if (left - 1 > i && nums[left - 1] == nums[left]) {
                    left++;
                    continue;
                }
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else if (nums[i] + nums[left] + nums[right] == 0) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        Demo15 demo15 = new Demo15();
        List<List<Integer>> lists = demo15.threeSum(nums);
        System.out.println(lists.toString());
    }
}
