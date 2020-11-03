package com.xlccc.zju;

/**
 * @author Linker
 * @date 2020/11/2 15:17
 * @description：
 */
public class Book1_1 {

    void PrintN(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

    /**
     * 递归实现
     *
     * @param N
     */
    void PrintN2(int N) {
        if (N > 0) {
            System.out.println(N);
            PrintN2(N - 1);
        }
    }

    public static void main(String[] args) {
        Book1_1 b = new Book1_1();
        b.PrintN(10);
        b.PrintN2(10);

    }
}
