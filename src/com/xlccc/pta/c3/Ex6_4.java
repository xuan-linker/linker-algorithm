package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/25 21:24
 * @description：习题6-4 使用函数输出指定范围内的Fibonacci数 (20分)
 */
public class Ex6_4 {

    public static void main(String[] args) {

        int m, n, t;
        m = Common.SC.nextInt();
        n = Common.SC.nextInt();
        t = Common.SC.nextInt();

        System.out.println(fib(t));
        PrintFN(m, n);
    }

    //计算斐波那契数
    public static int fib(int n) {
        int n1 = 1;
        int n2 = 1;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void PrintFN(int m, int n) {
        //判断是否包含斐波那契数
        boolean blankFlag = false;
        //遍历斐波那契数列，从i=1开始 直到 fib(i)>n
        int i = 1;
        while (true) {
            if (fib(i) > n) {
                if (blankFlag == false) {
                    System.out.println("No Fibonacci number");
                }
                break;
            } else {
                if (fib(i) > m) {
                    if (blankFlag == false) {
                        System.out.printf(fib(i) + "");
                        blankFlag = true;
                    } else {
                        System.out.printf(" " + fib(i));
                    }
                }
                i++;
            }
        }
    }
}
