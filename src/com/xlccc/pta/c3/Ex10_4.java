package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 22:35
 * @description：
 */
public class Ex10_4 {
    public static void main(String[] args) {

        double x = SC.nextDouble();
        int n = SC.nextInt();

        System.out.println(fn(x, n));

    }

    public static double fn(double x, int n) {
        int i = 1;
        if (n % 2 == 0) {
            i = -1;
        }

        if (n == 1) {
            return x;
        } else {
            return i * Math.pow(x, n) + fn(x, n - 1);
        }
    }
}
