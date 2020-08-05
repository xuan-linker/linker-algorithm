package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:32
 * @description：
 */
public class Fn2_1 {
    public static void main(String[] args) {
        int a = SC.nextInt();
        int b = SC.nextInt();
        int c = SC.nextInt();
        int d = SC.nextInt();
        double sum = 0.0;
        sum = a + b + c + d;
        System.out.println((int)sum);
        System.out.println(sum / 4.0);

    }
}
