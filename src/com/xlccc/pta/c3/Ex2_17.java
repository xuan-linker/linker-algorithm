package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:25
 * @description：
 */
public class Ex2_17 {
    public static void main(String[] args) {

        int n = SC.nextInt();

        cal(n);
    }

    public static void cal(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("pow(3,"+i+") = "+String.format("%.0f",Math.pow(3,i)));

        }
    }

}
