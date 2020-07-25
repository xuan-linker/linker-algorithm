package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/25 20:41
 * @description：习题6-2 使用函数求特殊a串数列和 (20分)
 */
public class Ex6_2 {
    /**
     * 给定两个均不超过9的正整数a和n，要求编写函数求a+aa+aaa++⋯+aa⋯a（n个a）之和。
     * 函数接口定义：
     * int fn( int a, int n );
     * int SumA( int a, int n );
     * 其中函数fn须返回的是n个a组成的数字；SumA返回要求的和。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * int fn( int a, int n );
     * int SumA( int a, int n );
     * <p>
     * int main()
     * {
     * int a, n;
     * <p>
     * scanf("%d %d", &a, &n);
     * printf("fn(%d, %d) = %d\n", a, n, fn(a,n));
     * printf("s = %d\n", SumA(a,n));
     * <p>
     * return 0;
     * }
     * 输入样例：
     * 2 3
     * 输出样例：
     * fn(2, 3) = 222
     * s = 246
     * 作者
     * 张高燕
     * 单位
     * 浙江大学
     * 代码长度限制
     * 16 KB
     * 时间限制
     * 400 ms
     * 内存限制
     *
     * @param args
     */
    public static void main(String[] args) {
        int a, n;
        a = Common.SC.nextInt();
        n = Common.SC.nextInt();

        System.out.println(fn(a, n));
        System.out.println(SumA(a, n));
    }

    public static int fn(int a, int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = num * 10 + a;
        }
        return num;
    }

    public static int SumA(int a, int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += fn(a, i);
        }
        return sum;
    }
}
