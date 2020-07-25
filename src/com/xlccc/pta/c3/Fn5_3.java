package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 21:39
 * @description：练习5-3 数字金字塔 (15分)
 */
public class Fn5_3 {
    public static void main(String[] args) {
        int n = Common.SC.nextInt();

        pyramid(n);

    }

    public static void pyramid(int n) {

        for (int i = 0; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
