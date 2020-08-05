package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 13:40
 * @description：
 */
public class Ex2_10 {
    public static void main(String[] args) {
        double x = SC.nextInt();
        System.out.println(cal(x));
    }

    public static double cal(double x) {
        if (x != 0) {
            return 1 / x;
        } else {
            return 0;
        }
    }
}
