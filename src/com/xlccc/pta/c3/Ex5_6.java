package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/25 18:20
 * @description：习题5-6 使用函数输出水仙花数 (20分)
 */
public class Ex5_6 {
    public static void main(String[] args) {

        int number1 = Common.SC.nextInt();
        int number2 = Common.SC.nextInt();
        PrintN(number1, number2);
    }

    /**
     * 水仙花数是指一个N位正整数（N≥3），它的每个位上的数字的N次幂之和等于它本身。例如：153=1
     * ​3
     * ​​ +5
     * ​3
     * ​​ +3
     * ​3
     * ​​ 。 本题要求编写两个函数，一个判断给定整数是否水仙花数，另一个按从小到大的顺序打印出给定区间(m,n)内所有的水仙花数。
     *
     * @param number
     * @return
     */
    public static int narcissistic(int number) {
        //判断是否为水仙花数

        //数的位数
        int count = 0;
        int num = number;
        int num2 = number;

        int sum = 0;
        //判断位数
        while (num > 0) {
            count += 1;
            num /= 10;
        }

        //计算水仙花数
        while (num2 > 0) {
            sum += Math.pow((num2 % 10), count);
            num2 /= 10;
        }
        //比较
        if (sum == number) {
            //true
            return 1;
        } else {
            //false
            return 0;
        }
    }

    //打印（m,n）内所有水仙花数
    public static void PrintN(int m, int n) {

        for (int i = m; i <= n; i++) {
            if (narcissistic(i) == 1) {
                System.out.printf(i + " ");
            }
        }
    }
}
