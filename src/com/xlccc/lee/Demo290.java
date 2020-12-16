package com.xlccc.lee;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Linker
 * @date 2020/12/16 21:28
 * @description：利用双射校验Hash冲突
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 */
public class Demo290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String str = sc.nextLine();
        Demo290 d = new Demo290();
        boolean b = d.wordPattern(pattern, str);
        System.out.println(b);
    }


    boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternToStrMap = new HashMap<>();
        HashMap<String, Character> strToPatternMap = new HashMap<>();
        // pattern
        char[] chars = pattern.toCharArray();
        String[] arr = s.split(" ");
        if (chars.length != arr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (patternToStrMap.containsKey(chars[i])) {
                String value = patternToStrMap.get(chars[i]);
                if (value.equals(arr[i])) {
                    continue;
                } else {
                    return false;
                }
            } else {
                patternToStrMap.put(chars[i], arr[i]);
            }

            if (strToPatternMap.containsKey(arr[i])) {
                Character value = strToPatternMap.get(arr[i]);

                if (value.equals(chars[i])) {
                    continue;
                } else {
                    return false;
                }
            } else {
                strToPatternMap.put(arr[i], chars[i]);
            }
        }
        return true;
    }
}
