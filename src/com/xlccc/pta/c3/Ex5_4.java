package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 22:37
 * @description：习题5-4 使用函数求素数和 (20分)
 */
public class Ex5_4 {
    /**
     * 本题要求实现一个判断素数的简单函数、以及利用该函数计算给定区间内素数和的函数。
     * <p>
     * 素数就是只能被1和自身整除的正整数。注意：1不是素数，2是素数。
     * <p>
     * 函数接口定义：
     * int prime( int p );
     * int PrimeSum( int m, int n );
     * 其中函数prime当用户传入参数p为素数时返回1，否则返回0；函数PrimeSum返回区间[m, n]内所有素数的和。题目保证用户传入的参数m≤n。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * #include <math.h>
     * <p>
     * int prime( int p );
     * int PrimeSum( int m, int n );
     * <p>
     * int main()
     * {
     * int m, n, p;
     * <p>
     * scanf("%d %d", &m, &n);
     * printf("Sum of ( ");
     * for( p=m; p<=n; p++ ) {
     * if( prime(p) != 0 )
     * printf("%d ", p);
     * }
     * printf(") = %d\n", PrimeSum(m, n));
     * <p>
     * return 0;
     * }
     * 输入样例：
     * -1 10
     * 输出样例：
     * Sum of ( 2 3 5 7 ) = 17
     *
     * @param args
     */
    public static void main(String[] args) {
        int m, n;
        m = Common.sc.nextInt();
        n = Common.sc.nextInt();
        System.out.println(PrimeSum(m, n));
    }

    public static int prime(int p) {
        int sqlNum = (int) Math.sqrt(p);
        if (p == 1) {
            return 0;
        }
        if (p >= 2) {
            boolean flag = false;
            for (int i = 2; i <= sqlNum; i++) {
                if (p % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static int PrimeSum(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (prime(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
