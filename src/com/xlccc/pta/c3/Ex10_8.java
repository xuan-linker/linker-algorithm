package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 23:06
 * @description：
 */
public class Ex10_8 {
    public static void main(String[] args) {

        int n = SC.nextInt();

        printdigits(n);
    }

    public static void printdigits(int n) {

        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            
        }
    }
}
