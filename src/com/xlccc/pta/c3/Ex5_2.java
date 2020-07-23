package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/23 22:25
 * @description：习题5-2 使用函数求奇数和 (15分)
 */
public class Ex5_2 {
    /**
     * 本题要求实现一个函数，计算N个整数中所有奇数的和，同时实现一个判断奇偶性的函数。
     * <p>
     * 函数接口定义：
     * int even( int n );
     * int OddSum( int List[], int N );
     * 其中函数even将根据用户传入的参数n的奇偶性返回相应值：当n为偶数时返回1，否则返回0。函数OddSum负责计算并返回传入的N个整数List[]中所有奇数的和。
     * <p>
     * 裁判测试程序样例：
     * #include <stdio.h>
     * <p>
     * #define MAXN 10
     * <p>
     * int even( int n );
     * int OddSum( int List[], int N );
     * <p>
     * int main()
     * {
     * int List[MAXN], N, i;
     * <p>
     * scanf("%d", &N);
     * printf("Sum of ( ");
     * for ( i=0; i<N; i++ ) {
     * scanf("%d", &List[i]);
     * if ( even(List[i])==0 )
     * printf("%d ", List[i]);
     * }
     * printf(") = %d\n", OddSum(List, N));
     * <p>
     * return 0;
     * }
     * <p>
     * <p>
     * 输入样例：
     * 6
     * 2 -3 7 88 0 15
     * 输出样例：
     * Sum of ( -3 7 15 ) = 19
     */
    public static void main(String[] args) {
        int count = Common.sc.nextInt();

        int[] list = new int[count];
        for (int i = 0; i < count; i++) {
            list[i] = Common.sc.nextInt();
        }
        System.out.println(OddSum(list, count));
    }

    public static int even(int n) {
        if (n % 2 == 0) {
            //偶数
            return 1;
        } else {
            //奇数
            return 0;
        }
    }

    public static int OddSum(int List[], int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (even(List[i]) == 0) {
                sum += List[i];
            }
        }
        return sum;
    }

}
