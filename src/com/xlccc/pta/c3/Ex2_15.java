package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:20
 * @description：
 */
public class Ex2_15 {
    public static void main(String[] args) {
        int x = SC.nextInt();

        System.out.println("sum = "+String.format("%.3f",cal(x)));
    }

    public static double cal(int x) {
        double sum = 0.0;
        double k = 1.0;
        for (int i = 1; i <= x; i += 3) {

            sum += k * (1.0 / i);
            k = -k;
        }
        return sum;
    }
}
