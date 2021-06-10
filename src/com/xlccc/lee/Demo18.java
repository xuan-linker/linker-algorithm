package com.xlccc.lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Linker
 * @date 2021/3/22 18:30
 * @description：
 */
public class Demo18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                if (j - 1 > i && nums[j] == nums[j - 1]) {
                    continue;
                }


                while (left < right) {

                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (left - 1 > j && (nums[left] == nums[left - 1])) {
                        left++;
                        continue;
                    }
                    if (sum == target) {
                        List<Integer> tempNum = new ArrayList<>();
                        tempNum.add(nums[i]);
                        tempNum.add(nums[j]);
                        tempNum.add(nums[left]);
                        tempNum.add(nums[right]);
                        result.add(tempNum);
                    }
                    if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }

            }

        }


        return result;
    }

    public static void main(String[] args) {
        Demo18 d = new Demo18();
        List<List<Integer>> lists = d.fourSum(new int[]{0, 4, -5, 2, -2, 4, 2, -1, 4}, 12);
        for (List<Integer> tempList : lists
        ) {
            System.out.println(tempList.toString());

        }
    }
}
