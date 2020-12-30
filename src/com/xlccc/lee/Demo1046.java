package com.xlccc.lee;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/12/30 9:06
 * @description：
 */
public class Demo1046 {
    public int lastStoneWeight(int[] stones) {

        while (validNumber(stones) >= 2) {
            int maxIndex = findMaxIndex(stones);
            int nextMaxIndex = findNextMaxIndex(stones);
            stones[maxIndex] = stones[maxIndex] - stones[nextMaxIndex];
            stones[nextMaxIndex] = 0;
        }
        return stones[findMaxIndex(stones)];

    }

    public int validNumber(int[] stones) {
        int count = 0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int findMaxIndex(int[] stones) {
        int maxIndex = -1;
        int max = 0;
        for (int i = 0; i < stones.length; i++) {
            if (i == 0) {
                maxIndex = 0;
                max = stones[0];
            } else {
                if (stones[i] > max) {
                    maxIndex = i;
                    max = stones[i];
                }
            }
        }
        return maxIndex;
    }

    public int findNextMaxIndex(int[] stones) {
        int maxIndex = findMaxIndex(stones);
        int[] nextStones = Arrays.copyOf(stones,stones.length);
        nextStones[maxIndex] = 0;
        int nextMaxIndex = findMaxIndex(nextStones);
        return nextMaxIndex;
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        Demo1046 d = new Demo1046();
        int i = d.lastStoneWeight(stones);
        System.out.println(" " + i);

    }
}
