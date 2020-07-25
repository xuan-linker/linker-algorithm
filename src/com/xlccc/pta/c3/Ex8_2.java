package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/7/25 23:03
 * @description：练习8-2 计算两数的和与差 (10分)
 */
public class Ex8_2 {

    public static void main(String[] args) {
        float op1 = SC.nextInt();
        float op2 = SC.nextInt();

        sum_diff(op1, op2);
    }

    public static void sum_diff(float op1, float op2) {
        System.out.println(op1 + op2);
        System.out.println(op1 - op2);
    }
}
