package com.xlccc.lee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2021/3/22 17:06
 * @description：搜索算法，深度优先算法或广度优先算法
 */
public class Demo17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        //StringToInteger
        Integer digitsNum = Integer.valueOf(digits);
        List<Integer> digitsNums = new ArrayList<>();
        while (digitsNum > 0) {
            digitsNums.add(digitsNum % 10);
            digitsNum /= 10;
        }


        String[][] nums = {
                {},
                {},
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}};

        for (int i = 0; i < digitsNums.size(); i++) {
            result = callBack(result, nums[digitsNums.get(i)]);
        }

        return result;

    }

    private List<String> callBack(List<String> result, String[] nums) {
        List<String> tempResult = new ArrayList<>();
        if (result.size() == 0) {
            for (int i = 0; i < nums.length; i++) {
                tempResult.add(nums[i]);

            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < result.size(); j++) {
                    tempResult.add(nums[i] + result.get(j));
                }
            }
        }
        return tempResult;
    }

    public static void main(String[] args) {
        Demo17 d = new Demo17();
        List<String> strings = d.letterCombinations("");
        System.out.println(strings.toString());
    }
}
