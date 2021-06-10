package com.xlccc.lee;

public class Demo72 {
    /**
     * 编辑距离
     * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数
     *
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {

        int[][] table = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i < table[0].length; i++) {
            table[0][i] = i;
        }
        for (int j = 0; j < table.length; j++) {
            table[j][0] = j;
        }
        for (int i = 1; i <= word1.length(); i++) {
            char c1 = word1.charAt(i - 1);
            for (int j = 1; j <= word2.length(); j++) {
                char c2 = word2.charAt(j - 1);
                if (c1 == c2) {
                    table[i][j] = table[i - 1][j - 1];
                } else {
                    table[i][j] = min(table[i - 1][j - 1], table[i - 1][j], table[i][j - 1]) + 1;
                }
            }
        }

        return table[table.length - 1][table[table.length - 1].length - 1];

    }

    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Demo72 d = new Demo72();
        String word1 = "horse";
        String word2 = "ros";
        int i = d.minDistance(word1, word2);
        System.out.println(i);

    }
}
