package com.xlccc.lbld;

import java.util.*;

/**
 * 求两数之和
 *
 * 一般使用双指针技巧，首先把数组排序再考虑。
 */
public class TowSum {
    /**
     *  * 最基本形式是这样:给你一个数组和一个整数 target ，可以保 证数组中存在两个数的和为 target ，请你返回这两个数的索引。
     */
    /**
     * 穷举
     * 时间复杂度O(N^2)
     * 空间复杂度O(1)
     */
    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1, -1};
    }

    /**
     * 使用hash表优化查询效率，
     * 查询时间为O(1),
     * 时间复杂度为O(N)
     * 但是空间复杂度为O(N)
     *
     * @param nums
     * @param target
     * @return
     */
    int[] towSumHash(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> index = new HashMap<>();
        //构造一个hash表：元素映射到相应到索引
        for (int i = 0; i < n; i++) {
            index.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int other = target - nums[i];
            if (index.containsKey(nums[i]) && index.get(other) != i) {
                return new int[]{i, index.get(other)};
            }
        }
        return new int[]{-1, -1};
    }

    class ITowSum {
        Map<Integer, Integer> freq = new HashMap<>();

        //向数据结构中添加一个数number
        public void add(int number) {
            // 记录number 出现的次数
            freq.put(number, freq.getOrDefault(number, 0) + 1);
        }

        //寻找当前数据结构中是否存在两个数的和为 value
        public boolean find(int value) {
            for (Integer key : freq.keySet()
            ) {
                int other = value - key;
                //情况一,两数相同
                if (other == key && freq.get(key) > 1) {
                    return true;
                }
                //情况二，两数不同
                if (other != key && freq.containsKey(other)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * 使用find()方法频繁，原来：O(N)
     * 现借助hash优化性能
     */
    class ITwoSum2 {
        Set<Integer> sum = new HashSet<>();
        List<Integer> nums = new ArrayList<>();

        public void add(int number) {
            for (int n : nums
            ) {
                sum.add(n + number);
            }
            nums.add(number);
        }

        public boolean find(int value) {
            return sum.contains(value);
        }
    }

}
