package com.xlccc.basic;


/**
 * @Author Linker
 * @Date 2020/5/11 9:15 下午
 * @Version 1.0
 * TODO: MiniMax Algorithm , to find Max's Min or Min's Max
 * FROM: https://www.geeksforgeeks.org/minimax-algorithm-in-game-theory-set-1-introduction/
 */
public class MiniMaxAlgorithm {
    public static void main(String[] args) {
        GFG gfg = new GFG();
        int[] scores = {3, 5, 2, 9, 12, 5, 23, 23};
        int n = scores.length;
        int h = gfg.log2(n);
        int res = gfg.miniMax(0, 0, true, scores, h);
        System.out.println("The optimal value is :" + res);
    }

    static class GFG {
        int miniMax(int depth, int nodeIndex, boolean isMax, int[] scores, int h) {
            if (depth == h) {
                return scores[nodeIndex];
            }

            if (isMax) {
                return Math.max(miniMax(depth + 1, nodeIndex * 2, false, scores, h),
                        miniMax(depth + 1, nodeIndex * 2 + 1, false, scores, h));

            } else {
                return Math.min(miniMax(depth + 1, nodeIndex * 2, true, scores, h),
                        miniMax(depth + 1, nodeIndex * 2 + 1, true, scores, h));
            }

        }

        int log2(int n) {
            return (n == 1) ? 0 : 1 + log2(n / 2);
        }
    }

}
