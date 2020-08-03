package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 22:53
 * @description：习题10-6 递归求Fabonacci数列 (10分)
 */
public class Ex10_6 {
    public static void main(String[] args) {

        int n = SC.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (n >= 2) {
            return f(n-2)+f(n-1);
        }
        return -1;
    }
}
