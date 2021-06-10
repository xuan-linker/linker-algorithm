package com.xlccc.lee;

/**
 * @author Linker
 * @date 2021/3/18 10:37
 * @description：14. 最长公共前缀
 */
public class Demo14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 ){
            return "";
        }
        char[][] chars = new char[strs.length][];
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            int length = strs[i].length();
            if (length < minLength) {
                minLength = length;
            }

            char[] tempCharArray = strs[i].toCharArray();
            chars[i] = tempCharArray;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char tempPoint = chars[0][i];
            for (int j = 0; j < chars.length; j++) {
                if (tempPoint != chars[j][i]) {
                    return sb.toString();
                }
            }
            sb.append(tempPoint);
        }
        return sb.toString();


    }

    public static void main(String[] args) {
        Demo14 demo14 = new Demo14();
        String[] strs = {"flower", "flow", "flight"};
        String res = demo14.longestCommonPrefix(strs);
        System.out.println(res);
    }
}
