package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 11:44
 * @description：练习2-4 温度转换 (5分)
 */
public class Ex2_4 {
    public static void main(String[] args) {
        int x = SC.nextInt();

        System.out.println(cal(x));
    }
    public static int cal(int x){
        return 5*(x-32)/9;
    }
}
