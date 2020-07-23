package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 22:23
 * @description：习题5-1 符号函数 (10分)
 */
public class Ex5_1 {
    /**
     * 本题要求实现符号函数sign(x)。
     * <p>
     * 函数接口定义：
     * int sign( int x );
     * 其中x是用户传入的整型参数。符号函数的定义为：若x大于0，sign(x) = 1；若x等于0，sign(x) = 0；否则，sign(x) = −1。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * int sign( int x );
     * <p>
     * int main()
     * {
     * int x;
     * <p>
     * scanf("%d", &x);
     * printf("sign(%d) = %d\n", x, sign(x));
     * <p>
     * return 0;
     * }
     * 输入样例：
     * 10
     * 输出样例：
     * sign(10) = 1
     */
    public static void main(String[] args) {

        int x = Common.sc.nextInt();
        System.out.println(sign(x));
    }

    public static int sign(int x) {
        if (x > 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
