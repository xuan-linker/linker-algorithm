package com.xlccc.lee;

import java.util.*;

/**
 * @author Linker
 * @date 2020/12/16 22:22
 * @description： 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Demo1 d = new Demo1();
        int[] ints = d.twoSum2(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 暴力求解
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        List<Integer> resultList = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && !resultList.contains(i); j++) {
                if (!resultList.contains(j) && nums[i] + nums[j] == target) {
                    resultList.add(i);
                    resultList.add(j);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 利用map提升效率
     * 将第二次for循环改进为从hashMap中读取数据
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> containMap = new HashMap<>();
        //校验是否为空
        if (nums.length > 0) {
            containMap.put(nums[0], 0);
        } else {
            return null;
        }
        for (int i = 1; i < nums.length; i++) {
            int res = target - nums[i];
            if (containMap.containsKey(res)) {
                return new int[]{containMap.get(res), i};
            } else {
                containMap.put(nums[i], i);
            }
        }
        return null;
    }
}
