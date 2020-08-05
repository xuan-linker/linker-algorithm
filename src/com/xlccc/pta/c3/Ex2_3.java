package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/8/5 11:35
 * @description：练习2-3 输出倒三角图案 (5分)
 */
public class Ex2_3 {
    /**
     * 0 2 4 6
     *  1 3 5
     *   2 4
     *    3
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 7-i*2; j++) {
                if (j%2 == 0) {
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
