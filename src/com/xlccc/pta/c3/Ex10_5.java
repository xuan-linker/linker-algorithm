package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 22:48
 * @description：
 */
public class Ex10_5 {
    public static void main(String[] args) {

        int m = SC.nextInt();
        int n = SC.nextInt();

        System.out.println(Ack(m, n));
    }

    public static int Ack(int m, int n) {

        if (m == 0) {
            return n + 1;
        } else if (n == 0 && m > 0) {
            return Ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return Ack(m - 1, Ack(m, n - 1));
        }
        return -1;
    }
}
