package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/7/25 21:50
 * @description：习题6-5 使用函数验证哥德巴赫猜想 (20分)
 */
public class Ex6_5 {
    /**
     * 本题要求实现一个判断素数的简单函数，并利用该函数验证哥德巴赫猜想：任何一个不小于6的偶数均可表示为两个奇素数之和。素数就是只能被1和自身整除的正整数。注意：1不是素数，2是素数。
     * 其中函数prime当用户传入参数p为素数时返回1，否则返回0；函数Goldbach按照格式“n=p+q”输出n的素数分解，其中p≤q均为素数。又因为这样的分解不唯一（例如24可以分解为5+19，还可以分解为7+17），要求必须输出所有解中p最小的解。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * #include <math.h>
     * <p>
     * int prime( int p );
     * void Goldbach( int n );
     * <p>
     * int main()
     * {
     * int m, n, i, cnt;
     * <p>
     * scanf("%d %d", &m, &n);
     * if ( prime(m) != 0 ) printf("%d is a prime number\n", m);
     * if ( m < 6 ) m = 6;
     * if ( m%2 ) m++;
     * cnt = 0;
     * for( i=m; i<=n; i+=2 ) {
     * Goldbach(i);
     * cnt++;
     * if ( cnt%5 ) printf(", ");
     * else printf("\n");
     * }
     * <p>
     * return 0;
     * }
     * 输入样例：
     * 89 100
     * 输出样例：
     * 89 is a prime number
     * 90=7+83, 92=3+89, 94=5+89, 96=7+89, 98=19+79
     * 100=3+97,
     * 作者
     * 张高燕
     * 单位
     * 浙江大学
     * 代码长度限制
     * 16 KB
     * 时间限制
     * 400 ms
     * 内存限制
     * 64 MB
     *
     * @param args
     */
    public static void main(String[] args) {
        int m, n, i, cnt;

        m = SC.nextInt();
        n = SC.nextInt();
//        i = SC.nextInt();
//        cnt = SC.nextInt();
        for (int j = m; j <= n; j++) {
            Goldbach(j);

        }
    }

    /**
     * 判断是否为素数
     *
     * @param p
     * @return
     */
    public static int prime(int p) {
        if (p == 1) {
            return 0;
        }
        if (p == 2) {
            return 1;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return 0;
            }
        }
        return 1;
    }


    public static void Goldbach(int n) {
        boolean flag = false;
        if (n <= 6) {
//            System.out.println("False n <= 6");
        }
        if (n % 2 == 0 && n > 6) {
            for (int i = 2; i <= n / 2; i++) {
                if (prime(n - i) == 1 && prime(i) == 1) {
                    System.out.println(n + "=" + i + "+" + (n - i));
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println(n + " is a prime number");
        }
    }
}
