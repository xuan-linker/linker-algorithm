package com.xlccc.zju.ai;

/**
 * @author Linker
 * @date 2021/4/18 16:14
 * @description：
 */
public class DecisionTree2 {
    public static void main(String[] args) {

        double[] count = new double[]{3.0, 1.0, 2.0};
        double[] e = new double[]{0.5, 1 / 6, 2 / 6};

        double sum = 0.0;
        for (int i = 0; i < count.length; i++) {
            sum += count[i] * e[i];
        }
        System.out.println("sum:" + sum);
        return;
    }
}
