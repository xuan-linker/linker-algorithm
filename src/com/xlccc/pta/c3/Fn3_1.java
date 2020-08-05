package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 21:31
 * @description：
 */
public class Fn3_1 {
    public static void main(String[] args) {
        int x = SC.nextInt();
        int y = SC.nextInt();
        int z = SC.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        if (x>z){
            int temp = x ;
            x =z ;
            z= temp;
        }
        if (y>z){
            int temp = y ;
            y=z ;
            z= temp;
        }
        System.out.println(x+"->"+y+"->"+z);
    }
}
