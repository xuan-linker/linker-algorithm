package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 21:34
 * @description：练习5-2 找两个数中最大者 (10分)
 */
public class Fn5_2 {
    /**
     * 本题要求对两个整数a和b，输出其中较大的数。
     * <p>
     * 函数接口定义：
     * int max( int a, int b );
     * 其中a和b是用户传入的参数，函数返回的是两者中较大的数。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * int max( int a, int b );
     * <p>
     * int main()
     * {
     * int a, b;
     * <p>
     * scanf("%d %d", &a, &b);
     * printf("max = %d\n", max(a, b));
     * <p>
     * return 0;
     * }
     * <p>
     * 你的代码将被嵌在这里
     * 输入样例：
     * -5 8
     * 输出样例：
     * max = 8
     */

    public static void main(String[] args) {
        int a = Common.SC.nextInt();
        int b = Common.SC.nextInt();

        System.out.println(max(a, b));
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
