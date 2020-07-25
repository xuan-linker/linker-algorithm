package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/24 23:05
 * @description：习题5-5 使用函数统计指定数字的个数 (15分)
 */
public class Ex5_5 {
    /**
     * 本题要求实现一个统计整数中指定数字的个数的简单函数。
     * <p>
     * 函数接口定义：
     * int CountDigit( int number, int digit );
     * 其中number是不超过长整型的整数，digit为[0, 9]区间内的整数。函数CountDigit应返回number中digit出现的次数。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * int CountDigit( int number, int digit );
     * <p>
     * int main()
     * {
     * int number, digit;
     * <p>
     * scanf("%d %d", &number, &digit);
     * printf("Number of digit %d in %d: %d\n", digit, number, CountDigit(number, digit));
     * <p>
     * return 0;
     * }
     * 输入样例：
     * -21252 2
     * 输出样例：
     * Number of digit 2 in -21252: 3
     *
     * @param args
     */
    public static void main(String[] args) {

        int number, digit;
        number = Common.SC.nextInt();
        digit = Common.SC.nextInt();

        System.out.println(CountDigit(number, digit));
    }

    public static int CountDigit(int number, int digit) {
        int absNumber = Math.abs(number);

        int count = 0;
        while (absNumber > 0) {
            if (absNumber % 10 == digit) {
                count += 1;
            }
            absNumber = absNumber / 10;
        }
        return count;
    }
}
