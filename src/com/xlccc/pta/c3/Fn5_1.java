package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 21:22
 * @description：练习5-1 求m到n之和 (10分)
 */
public class Fn5_1 {
    /**
     * 本题要求实现一个计算m~n（m<n）之间所有整数的和的简单函数。
     * <p>
     * <p>
     * 函数接口定义：
     * int sum( int m, int n );
     * 其中m和n是用户传入的参数，保证有m<n。函数返回的是m~n之间所有整数的和。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * int sum(int m, int n);
     * <p>
     * int main()
     * {
     * int m, n;
     * <p>
     * scanf("%d %d", &m, &n);
     * printf("sum = %d\n", sum(m, n));
     * <p>
     * return 0;
     * }
     * <p>
     * 输入样例：
     * -5 8
     * 输出样例：
     * sum = 21
     * 作者
     * 张高燕
     * 单位
     * 浙江大学城市学院
     * 代码长度限制
     * 16 KB
     * 时间限制
     * 400 ms
     * 内存限制
     */
    public static void main(String[] args) {
        int m, n;

        m = Common.SC.nextInt();

        n = Common.SC.nextInt();

        System.out.println(sum(m, n));
    }

    public static int sum(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
