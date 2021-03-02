package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/24 14:51
 * @description：
 */
public class Demo62 {
    public int uniquePaths(int m, int n) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Demo62 d = new Demo62();
        int i = d.uniquePaths(3, 7);

        System.out.println(i);
    }
}
