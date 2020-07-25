package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/25 19:37
 * @description：习题5-7 使用函数求余弦函数的近似值 (15分)
 */
public class Ex5_7 {
    public static void main(String[] args) {

        double e = Common.SC.nextDouble();
        double x = Common.SC.nextDouble();
        String s = String.format("%.6f",funcos(e, x));
        System.out.println("cos(" + x + ")=" + s);
    }

    public static double funcos(double e, double x) {
        double sum = 0.0;
        double part = 0.0;
        double i = 1.0;
        int count = 0;
        //计算
        do {
            //计算part
            part = i * Math.pow(x, count * 2) / factorial(count * 2);
            //+=sum
            sum += part;
            //i=-i
            count += 1;
            i = -i;

        } while (Math.abs(part) > e);
        return sum;
    }

    public static double factorial(int number) {
        if (number <= 0) {
            return 1;
        }

        if (number == 1) {
            return number;
        } else {
            return number * factorial(number - 1);
        }
    }

}
