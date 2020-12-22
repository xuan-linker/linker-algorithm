package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/22 16:27
 * @description：
 */
public class Demo50 {
    /**
     * 暴力求解
     * 超时
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n > 0) {
            double sum = 1;
            for (int i = 0; i < n; i++) {
                sum *= x;
            }
            return sum;
        } else if (n < 0) {
            double sum = 1;
            for (int i = 0; i < Math.abs(n); i++) {
                sum *= x;
            }
            return 1 / sum;
        }
        return -1;
    }

    /**
     * 二分优化
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow2(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        double half = myPow2(x, n / 2);
        double rest = myPow2(x, n % 2);
        return rest * half * half;

    }

    public static void main(String[] args) {
//        Math.pow()
        Demo50 d = new Demo50();
        double v = d.myPow2(
                2.00000, 10);
//        double v = d.myPow(2.00000, 10);
        System.out.println(v);
    }
}
