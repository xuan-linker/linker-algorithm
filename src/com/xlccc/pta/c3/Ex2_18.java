package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:28
 * @description：练习2-18 求组合数 (15分)
 */
public class Ex2_18 {
    public static void main(String[] args) {

        int m = SC.nextInt();
        int n = SC.nextInt();

        System.out.println("result = " + (fact(n) / (fact(m) * fact(n - m))));

    }

    public static int fact(int x) {
        if (x == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
