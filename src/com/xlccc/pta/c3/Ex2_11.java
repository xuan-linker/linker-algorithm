package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 13:42
 * @description：
 */
public class Ex2_11 {
    public static void main(String[] args) {
        double x = SC.nextDouble();
        System.out.println(cal(x));
    }

    public static double cal(double x) {
        if (x >= 0) {
            return Math.pow(x, 0.5);
        } else {
            return ((x + 1) * (x + 1) + 2 * x + 1 / x);
        }
    }
}
