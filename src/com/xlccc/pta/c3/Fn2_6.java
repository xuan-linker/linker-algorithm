package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:19
 * @description：
 */
public class Fn2_6 {
    public static void main(String[] args) {

        int x = SC.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += cal(i);

        }
        System.out.println(sum);
    }

    public static int cal(int n) {
        if (n == 0) {
            return 1;

        }
        if (n == 1) {
            return 1;
        } else {
            return n * (cal(n - 1));
        }
    }
}
