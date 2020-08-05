package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:11
 * @description：练习2-14 求奇数分之一序列前N项和 (15分)
 * 原题输出样例错误
 */
public class Ex2_14 {
    public static void main(String[] args) {
        int x = SC.nextInt();
        System.out.println("sum = " + String.format("%.6f", cal(x)));

    }

    public static double cal(int x) {
        double sum = 0.0;

        for (int i = 1; i <= x; i = i + 2) {

            sum += 1.0 / i;
        }
        return sum;
    }
}
