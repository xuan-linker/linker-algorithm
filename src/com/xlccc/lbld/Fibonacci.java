package com.xlccc.lbld;

import java.util.HashMap;

/**
 * 斐波纳切数列
 */
public class Fibonacci {
    /**
     * 简单明了但是效率低下
     *
     * @param N
     * @return
     */
    int fib(int N) {
        if (N == 1 || N == 2) return 1;
        return fib(N - 1) + fib(N - 2);
    }

    /**
     * 通过备忘录减枝，减少子问题数量
     */
    HashMap<Integer, Integer> memo = new HashMap<>();

    int fibWithHash(int N) {
        if (N == 1 || N == 2) return 1;
        if (memo.containsKey(N)) return memo.get(N);
        memo.put(N, fibWithHash(N - 1) + fibWithHash(N - 2));
        return memo.get(N);
    }

    /**
     * 自底向上进行推算
     *
     * @param N
     * @return
     */
    int fibWithDp(int N) {
        int[] dp = new int[N + 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    /**
     * 进一步优化存储空间
     *
     * @param N
     * @return
     */
    int fibWithDpOptimize(int N) {
        if (N == 1 || N == 2) return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= N; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public static void main(String[] args) {
        Fibonacci fc = new Fibonacci();
        int result = fc.fib(10);
        System.out.println(result);

        int result2 = fc.fibWithHash(10);
        System.out.println(result2);

        int result3 = fc.fibWithDp(10);
        System.out.println(result3);

        int result4 = fc.fibWithDpOptimize(10);
        System.out.println(result4);
    }
}
