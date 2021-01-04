package com.xlccc.lee;

/**
 * @author Linker
 * @date 2021/1/4 15:06
 * @description：
 */
public class Demo509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Demo509 d = new Demo509();
        int fib = d.fib(4);
        System.out.println(fib);

    }
}
