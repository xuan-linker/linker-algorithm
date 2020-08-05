package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:41
 * @description：
 */
public class Fn2_3 {
    public static void main(String[] args) {
        int m = SC.nextInt();
        int n = SC.nextInt();

        System.out.println("sum = "+String.format("%.6f" , cal(m,n)));
    }

    public static double cal(int m, int n) {
        double sum = 0.0;
        for (int i = m; i <= n; i++) {
            sum += i * i;
        }
        for (int i = m; i <= n; i++) {

            sum += 1.0 / (i);
        }
        return sum;
    }
}
