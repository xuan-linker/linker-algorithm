package com.xlccc.lbld.test;

import java.util.*;

public class PermutationTest {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        //记录路径
        LinkedList<Integer> track = new LinkedList<>();
        ///回溯
        backtrack(nums, track);
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> track) {
        //触发结束条件
        if (nums.length == track.size()) {
            res.add(new LinkedList<>(track));
            return;
        }
        //做选择
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            //进入决策层下一层
            backtrack(nums, track);
            //取消选择
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        PermutationTest t = new PermutationTest();
        List<List<Integer>> permute = t.permute(nums);
        System.out.println(Arrays.deepToString(new List[]{permute}));
    }
}
