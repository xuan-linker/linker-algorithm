package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/22 15:28
 * @description：
 */
public class Demo32 {
    public int longestValidParentheses(String s) {
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int stackCount = 0;

            int count = 0;
            int j = i;
            while (j < s.length()) {
                if (s.charAt(j) == '(') {
                    stackCount++;
                }
                if (s.charAt(j) == ')') {
                    if (stackCount > 1) {
                        stackCount--;
                        count+=2;
                    } else if (stackCount == 1) {
                        stackCount--;
                        count+=2;
                        max = Math.max(max, count);
                    } else {
                        max = Math.max(max, count);
                        break;
                    }
                }
                j++;
            }
        }
        return max ;

    }


    public static void main(String[] args) {
//        String s = ")()())";
        String s = "(()";
        Demo32 d = new Demo32();
        int i = d.longestValidParentheses(s);
        System.out.println(i);

    }
}
