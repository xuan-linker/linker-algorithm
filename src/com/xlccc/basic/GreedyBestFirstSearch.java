package com.xlccc.basic;

/**
 * @Author Linker
 * @Date 2020/5/10 8:16 下午
 * @Version 1.0
 * TODO:Greedy best-first search
 * FROM:https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/
 */
public class GreedyBestFirstSearch {

    public static void main(String[] args) {

        /**
         * Following is the problem statement.
         * You are given n activities with their start and finish times.
         * Select the maximum number of activities that can be performed by a single person,
         * assuming that a person can only work on a single activity at a time.
         *
         *  start[]  =  {1, 3, 0, 5, 8, 5};
         *  finish[] =  {2, 4, 6, 7, 9, 9};
         */
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};
        int n = s.length;
        printMaxActivities(s, f, n);

    }

    public static void printMaxActivities(int[] s, int[] f, int n) {
        int i, j;

        //The fist activity always gets selected
        i = 0;
        System.out.println(i + " ");

        for (j = 1; j < n; j++) {
            if (s[j] >= f[i]) {
                System.out.println(j + " ");
                i = j;
            }
        }
    }

}
