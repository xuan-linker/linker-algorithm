package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:25
 * @description：
 */
public class Ex3_3 {
    public static void main(String[] args) {
        int n = SC.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = SC.nextInt();
        }

        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += num[i];
            if (num[i] >= 60) {
                count += 1;
            }
        }
        System.out.println("average = " + sum / n);
        System.out.println("count = "+count);

    }
}
