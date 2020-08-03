package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 22:21
 * @description：本题要求实现一个用递归计算1+2+3+…+n的和的简单函数。
 */
public class Ex10_1 {
    public static void main(String[] args) {

        int n ;
        n = SC.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {

        if (n== 0){
            return n;
        }else {
            return n+sum(n-1);
        }
    }
}
