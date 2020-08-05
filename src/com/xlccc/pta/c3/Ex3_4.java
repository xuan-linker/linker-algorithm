package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:31
 * @description：练习3-4 统计字符 (15分)
 */
public class Ex3_4 {
    public static void main(String[] args) {

        String str = "aZ &\n09 Az";

        int letter = 0;
        int blank = 0;
        int digit = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                letter++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                letter++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digit++;
            } else if (str.charAt(i) == ' ' || str.charAt(i) == '\n') {
                blank++;
            } else {
                other++;
            }
        }
        System.out.println("letter = " + letter +
                " , blank = " + blank +
                " , digit = " + digit +
                " , other = " + other);
    }
}
