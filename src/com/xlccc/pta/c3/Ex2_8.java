package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 12:09
 * @description：C=5×(F−32)/9
 */
public class Ex2_8 {
    public static void main(String[] args) {
        int x = SC.nextInt();
        System.out.println("Celsius="+(5*(x-32)/9));
    }
}
