package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:21
 * @description：练习3-2 计算符号函数的值 (10分)
 */
public class Ex3_2 {

    public static void main(String[] args) {

        int n = SC.nextInt();
        System.out.println(signCal(n));
    }

    public static int signCal(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
