package com.xlccc.zju.ai;

import com.xlccc.zju.Cal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Linker
 * @date 2021/4/18 15:48
 * @description：
 */
public class DecisionTree {
    public static void main(String[] args) {
        Cal c = new Cal();
        Scanner sc = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();
        double v = 0;
        while (v != -1) {
            v = sc.nextDouble();
            if (v !=-1) {
                nums.add(v);
            }
        }
        Double[] doubles = new Double[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            doubles[i] = nums.get(i);
        }
        double ent = c.ent(doubles);
        System.out.println("result:" + ent);

    }

}
