package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 22:28
 * @description：习题10-3 递归实现指数函数 (15分)
 */
public class Ex10_3 {
    public static void main(String[] args) {

        double x = SC.nextDouble();
        int n = SC.nextInt();


        System.out.println(calc_pow(x, n));

    }

    public static double calc_pow(double x, int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return x;
        } else {
            return x * calc_pow(x, n - 1);
        }

    }
}
