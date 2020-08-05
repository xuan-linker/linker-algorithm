package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:07
 * @description：
 */
public class Ex2_13 {
    public static void main(String[] args) {
        int x = SC.nextInt();
        System.out.println(String.format("%.6f",cal(x)));
    }

    public static double cal(int x) {
        double sum = 0.0;
        for (int i = 1; i <= x; i++) {

            sum += 1.0 / i;

        }
        return sum;
    }
}
