package com.xlccc.zju;

/**
 * @author Linker
 * @date 2020/11/2 15:22
 * @description：一元多项式
 */
public class Book1_3 {
    /**
     * f(x) = a0+a1x+a2x^2+...+a n-1 x^(n-1)+anx^n
     */
    double f(int n, double a[], double x) {
        /**
         * 计算阶数为n，系数为a[0]...a[n]的多项式在x点的值
         */

        double p = a[0];
        for (int i = 1; i <= n; i++) {
            p += a[i] * Math.pow(x, i);
        }
        return p;
    }

    /**
     * f(x)=a0+x(a1+x(...(an-1+x(an))...))
     */
    double f2(int n, double a[], double x) {
        double p = a[n];
        for (int i = n; i > 0; i--) {
            p = x * p + a[i - 1];
        }
        return p;
    }


}
