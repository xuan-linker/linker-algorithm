package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 13:44
 * @description：练习2-12 输出华氏-摄氏温度转换表 (15分)
 */
public class Ex2_12 {
    public static void main(String[] args) {
        double lower = SC.nextDouble();
        double upper = SC.nextDouble();

        cal(lower,upper);
    }

    public static void cal(double lower, double upper) {
        if (lower > upper || upper > 100) {
            System.out.println("Invalid.");
        } else {
            System.out.println("fahr celsius");
            for (double i = lower; i < upper; i = i + 2) {
                double res = 5*(i-32)/9;
                System.out.println((int)i+" "+String.format("%.1f",res));
            }
        }
    }
}
