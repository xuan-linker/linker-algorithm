package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/17 17:24
 * @description：暴力求解
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class Demo5 {
    public String longestPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return s;
        }
        String maxPalindrome = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if ((j - i + 1) > maxPalindrome.length() && verifyPalindrome(s, i, j)) {
                    maxPalindrome = s.substring(i, j + 1);
                }
            }
        }

        return maxPalindrome;
    }

    public boolean verifyPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }


    public static void main(String[] args) {
        String s = "babad";
        String s2 = "cbbd";
        String s3 = "aacabdkacaa";
        Demo5 d = new Demo5();
        String s1 = d.longestPalindrome(s3);
        System.out.println(s1);

//        String f2 = d.getMaxPalindrome(s2, 2);
//        System.out.println(f2);

    }
}
