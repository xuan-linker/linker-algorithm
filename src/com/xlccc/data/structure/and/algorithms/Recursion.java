package com.xlccc.data.structure.and.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Linker
 * @date 2020/11/1 20:44
 * @description：递归
 */
public class Recursion {
    public Integer step(int n) {
        if (n == 1) {
            return 1;
        }
        return step(n - 1) + 1;
    }

    int depth = 0;

    Map<Integer, Integer> hasSolvedList = new HashMap();

    /**
     * 有n个台阶，可以跨1个台阶或者2个台阶
     *
     * @param n
     * @return
     */
    public Integer walkTheSteps(int n) throws Exception {
        //深度超过1000 抛出异常
        ++depth;
        if (depth > 1000) {
            throw new Exception();
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        //优化
        if (hasSolvedList.containsKey(n)) {
            return hasSolvedList.get(n);
        }

        int ret = walkTheSteps(n - 1) + walkTheSteps(n - 2);
        hasSolvedList.put(n, ret);
        return ret;
    }

    public static void main(String[] args) throws Exception {
        Recursion recursion = new Recursion();
        System.out.println(recursion.step(3));

        System.out.println(recursion.walkTheSteps(10));

        //Exception in thread "main" java.lang.StackOverflowError

    }
}
