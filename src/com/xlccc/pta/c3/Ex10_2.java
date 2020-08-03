package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 22:24
 * @description：
 */
public class Ex10_2 {
    public static void main(String[] args) {

        int number = SC.nextInt();

        System.out.println(fact(number));
        System.out.println(factsum(number));
    }

    public static double fact(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return n;
        } else {
            return n * fact(n - 1);
        }

    }

    public static double factsum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {

            sum += fact(i);


        }
        return sum;
    }
}
