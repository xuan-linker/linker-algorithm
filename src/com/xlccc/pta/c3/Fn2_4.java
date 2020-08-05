package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:09
 * @description：
 */
public class Fn2_4 {
    public static void main(String[] args) {

        int n = SC.nextInt();
        System.out.println(String.format("%.3f", cal(n)));
    }

    public static double cal(int n) {
        double sum = 0.0;
        double k = 1.0;
        for (int i = 1; i <= n; i++) {


            sum += k * i / (2 * i - 1);
            k = -k;
        }
        return sum;
    }

}
