package com.xlccc.lee;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Linker
 * @date 2020/12/17 14:19
 * @description： 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class Demo3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.length() == 0) {
            return 0;
        }
        int containMax = 0;
        int containMin = 0;
        Map<Character, Integer> containMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (containMap.containsKey(s.charAt(i))) {
                containMin = Math.max(containMin,containMap.get(s.charAt(i)) + 1);
            }
            containMap.put(s.charAt(i), i);

            max = Math.max(max, i - containMin + 1);
        }
        return max;
    }

    public static void main(String[] args) {
//        String s = "pwwkew";
//        String s = " ";
        String s = "abcabcbb";
        Demo3 d = new Demo3();
        int i = d.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
