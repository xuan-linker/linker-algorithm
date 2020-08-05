package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:41
 * @description：练习3-5 输出闰年 (15分)
 * 输出21世纪中截止某个年份以来的所有闰年年份。注意：闰年的判别条件是该年年份能被4整除但不能被100整除、或者能被400整除。
 */
public class Ex3_5 {
    public static void main(String[] args) {
        int year = SC.nextInt();
        for (int i = 2000; i <= year; i++) {

            if (isTrueYear(i)){
                System.out.println(i);
            }
        }


    }

    public static boolean isTrueYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

}
