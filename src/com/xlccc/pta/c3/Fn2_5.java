package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:11
 * @description：
 */
public class Fn2_5 {
    public static void main(String[] args) {
        int n = SC.nextInt();
        System.out.println("sum = " + String.format("%.2f", cal(n)));
    }

    public static double cal(int n) {
        double sum = 0.0;
        for (double i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }
        return sum;
    }
}
