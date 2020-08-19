package com.xlccc.basic;

import java.util.Scanner;

/**
 * @author Linker
 * @date 2020/8/19 10:48
 * @description：
 */
public class Hannoi {

    static int frequency = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆盘总数");
        int sum = input.nextInt();
        char src = 'a', tmp = 'b', dst = 'c';
        hanoi(sum, src, tmp, dst);
        System.out.printf("总共移动了%d次", frequency);
    }

    public static void move(int number, char src, char dst) {
        frequency++;
        System.out.printf("将 %d 号盘子 从 %s 移动到 %s 处\n", number, src, dst);
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        } else {
            hanoi(n - 1, a, c, b);
            move(n, a, c);
            hanoi(n - 1, b, a, c);
        }
    }
}
