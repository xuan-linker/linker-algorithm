package com.xlccc.zju.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Linker
 * @date 2021/4/18 16:49
 * @description：
 */
public class Gini {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please input count ：");
        int count = sc.nextInt();
        List<Double> numList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("please input number");
            double num = sc.nextDouble();
            numList.add(num);
        }
        double result = 1.0;
        for (Double n : numList
        ) {
            result -= n * n;
        }
        System.out.println("result: " + result);
    }
}
