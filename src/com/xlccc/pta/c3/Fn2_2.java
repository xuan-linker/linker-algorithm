package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 14:37
 * @description：
 */
public class Fn2_2 {
    public static void main(String[] args) {
        int x = SC.nextInt();

        if (x <= 50 ){
            System.out.println(x*0.53);
        }
        else{
            System.out.println(50*0.53 + (x-50)*0.58);
        }
    }
}
