package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 22:33
 * @description：习题5-3 使用函数计算两点间的距离 (10分)
 */
public class Ex5_3 {
    /**
     * 本题要求实现一个函数，对给定平面任意两点坐标(x
     * ​1
     * ​​ ,y
     * ​1
     * ​​ )和(x
     * ​2
     * ​​ ,y
     * ​2
     * ​​ )，求这两点之间的距离。
     * <p>
     * 函数接口定义：
     * double dist( double x1, double y1, double x2, double y2 );
     * 其中用户传入的参数为平面上两个点的坐标(x1, y1)和(x2, y2)，函数dist应返回两点间的距离。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * #include <math.h>
     * <p>
     * double dist( double x1, double y1, double x2, double y2 );
     * <p>
     * int main()
     * {
     * double x1, y1, x2, y2;
     * <p>
     * scanf("%lf %lf %lf %lf", &x1, &y1, &x2, &y2);
     * printf("dist = %.2f\n", dist(x1, y1, x2, y2));
     * <p>
     * return 0;
     * }
     * <p>
     * 输入样例：
     * 10 10 200 100
     * 输出样例：
     * dist = 210.24
     */
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        x1 = Common.sc.nextDouble();

        y1 = Common.sc.nextDouble();
        x2 = Common.sc.nextDouble();
        y2 = Common.sc.nextDouble();

        System.out.println(dist(x1, y1, x2, y2));
    }

    public static double dist(double x1, double y1, double x2, double y2) {
        double count = 0.0;
        count = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return count;
    }
}
