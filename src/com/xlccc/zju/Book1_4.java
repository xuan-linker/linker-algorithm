package com.xlccc.zju;

/**
 * @author Linker
 * @date 2020/11/2 16:50
 * @description：最大子列和
 */
public class Book1_4 {

    int MaxSubseqSum1(int List[]) {
//        int i, j, k;
        int ThisSum = 0, MaxSum = 0;
        for (int i = 0; i < List.length; i++) {
            for (int j = i; j < List.length; j++) {
                ThisSum += List[j];
                if (ThisSum > MaxSum) {
                    MaxSum = ThisSum;
                }
            }
            ThisSum = 0;
        }
        System.out.println(MaxSum);
        return MaxSum;
    }

    public static void main(String[] args) {
        int list[] = {-2, 11, -4, 13, -5, -2};

        Book1_4 b = new Book1_4();
        System.out.println(b.MaxSubseqSum1(list));
    }
}
