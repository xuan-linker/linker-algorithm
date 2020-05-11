package com.xlccc.basic;


/**
 * @Author Linker
 * @Date 2020/5/11 9:41 下午
 * @Version 1.0
 */
public class AlphaBetaAlgorithm {
    public static void main(String[] args) {
        GFG gfg = new GFG();
        int[] values = {3, 5, 6, 9, 1, 2, 0, -1};
        System.out.println("The optimal value is : " + gfg.miniMax(0, 0, true, values, gfg.MIN, gfg.MAX));
    }

    static class GFG {
        /**
         * Init values of
         * Aplha and Beta
         */
        int MAX = 1000;
        int MIN = -1000;

        int miniMax(int depth, int nodeIndex, Boolean maximizingPlayer, int[] values, int alpha, int beta) {
            {
                if (depth == 3) {
                    return values[nodeIndex];
                }
                if (maximizingPlayer) {
                    int best = MIN;

                    for (int i = 0; i < 2; i++) {
                        int val = miniMax(depth + 1, nodeIndex * 2 + i, false, values, alpha, beta);
                        best = Math.max(best, val);
                        alpha = Math.max(alpha, best);

                        if (beta <= alpha) {
                            break;
                        }
                    }
                    return best;
                } else {
                    int best = MAX;

                    for (int i = 0; i < 2; i++) {
                        int val = miniMax(depth + 1, nodeIndex * 2 + i, true, values, alpha, beta);
                        best = Math.min(best, val);
                        beta = Math.min(beta, best);

                        if (beta <= alpha) {
                            break;
                        }
                    }
                    return best;
                }
            }
        }
    }
}


