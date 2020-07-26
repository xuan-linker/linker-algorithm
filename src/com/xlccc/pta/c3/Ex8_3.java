package com.xlccc.pta.c3;


/**
 * @author Linker
 * @date 2020/7/27 0:17
 * @description：习题8-3 数组循环右移 (20分)
 */
public class Ex8_3 {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = ArrayShift(a, 2);
        for (int t : a
        ) {
            System.out.printf(t+" ");
        }
        System.out.println( );
        for (int t : b
        ) {
            System.out.printf(t+" ");
        }

    }

    public static int[] ArrayShift(int a[], int m) {

        int b[] = new int[a.length];
        for (int i = 0; i < m; i++) {
            b[i] = a[a.length - m + i];
        }
        for (int i = m; i < a.length; i++) {
            b[i] = a[i - m];
        }
        return b;
    }
}
