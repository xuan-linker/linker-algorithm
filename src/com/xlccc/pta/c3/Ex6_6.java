package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/7/25 22:49
 * @description：习题6-6 使用函数输出一个整数的逆序数 (20分)
 */
public class Ex6_6 {
    /**
     * 本题要求实现一个求整数的逆序数的简单函数。
     * <p>
     * 函数接口定义：
     * int reverse( int number );
     * 其中函数reverse须返回用户传入的整型number的逆序数。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * int reverse( int number );
     * <p>
     * int main()
     * {
     * int n;
     * <p>
     * scanf("%d", &n);
     * printf("%d\n", reverse(n));
     * <p>
     * return 0;
     * }
     * <p>
     * 输入样例：
     * -12340
     * 输出样例：
     * -4321
     *
     * @param args
     */
    public static void main(String[] args) {

        int number = SC.nextInt();
        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        //避免- toString造成影响
        String numStr = String.valueOf(Math.abs(number));
        String numRes = "";
        //判断是否0在开头都被跳过
        boolean flag = false;
        for (int i = numStr.length() - 1; i >= 0; i--) {

            //跳过所有开头的0
            if (flag == false) {
                if (numStr.charAt(i) == 0 && numStr.charAt(i - 1) == 0) {
                    //跳过0开头的位数
                } else if (numStr.charAt(i) == 0 && numStr.charAt(i - 1) != 0) {
                    flag = true;
                } else if (numStr.charAt(i) != 0) {
                    flag = true;
                }

            } else {
                numRes += numStr.charAt(i);
            }

        }
        //对结构分类输出
        if (number < 0) {
            return (Integer.valueOf(numRes) * -1);
        } else if (number > 0) {
            return Integer.valueOf(numRes);
        } else {
            return 0;
        }
    }
}
