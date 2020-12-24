package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/24 10:12
 * @description：135.分发糖果
 */
public class Demo135 {
    /**
     * 暴力求解
     *
     * @param ratings
     * @return 
     */
    public int candy(int[] ratings) {
        //init
        int[] candyNum = new int[ratings.length];
        for (int i = 0; i < candyNum.length; i++) {
            candyNum[i] = 1;
        }
        if (ratings.length == 1) {
            return 1;
        } else if (ratings.length == 0) {
            return 0;
        }

        int right = 0;
        while (right != ratings.length) {
            right = 0;
            //相邻的孩子中，评分高的孩子必须获得更多的糖果。
            for (int i = 0; i < ratings.length; i++) {
                if (needAdd(ratings, i, candyNum)) {
                    candyNum[i]++;
                } else {
                    continue;
                }
            }
            for (int i = 0; i < ratings.length; i++) {
                if (needAdd(ratings, i, candyNum)) {
                } else {
                    right++;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < candyNum.length; i++) {
            sum += candyNum[i];
        }
        return sum;
    }

    //分数高的同学糖果数量比分数低的同学糖果数量多
    public boolean needAdd(int[] ratings, int i, int[] candy) {

        if (i == 0) {
            if (ratings[0] > ratings[1]) {
                if (candy[i] > candy[i + 1]) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if (i == ratings.length - 1) {
            if (ratings[ratings.length - 1] > ratings[ratings.length - 2]) {
                if (candy[i] > candy[i - 1]) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            int flag = 0;
            if (ratings[i] > ratings[i - 1]) {
                if (candy[i] > candy[i - 1]) {
//                    return false;
                } else {
                    flag++;
                }
            }
            if (ratings[i] > ratings[i + 1]) {
                if (candy[i] > candy[i + 1]) {
//                    return false;
                } else {
                    flag++;
                }
            }
            if (flag > 0) {
                return true;
            }
            return false;
        }
    }

    public int candy2(int[] ratings) {
        /**
         * 左规则：当 \textit{ratings}[i - 1] < \textit{ratings}[i]ratings[i−1]<ratings[i] 时，ii 号学生的糖果数量将比 i - 1i−1 号孩子的糖果数量多。
         *
         * 右规则：当 \textit{ratings}[i] > \textit{ratings}[i + 1]ratings[i]>ratings[i+1] 时，ii 号学生的糖果数量将比 i + 1i+1 号孩子的糖果数量多。
         *
         */
//        int[] left = new int[ratings.length];
//        for (int i = 0; i < ratings.length - 1; i++) {
//            if (ratings[i] > ratings[i + 1]) {
//                left[i] = left[i + 1] + 1;
//            } else {
//                left[i] = 1;
//            }
//        }
//        int right = 0;
//        int ret = 0;
//        for (int i = ratings.length - 1; i > 1; i--) {
//            if (ratings[i] > ratings[i - 1]) {
//                right++;
//            } else {
//                right = 1;
//            }
//            ret += Math.max(left[i], right);
//        }
//        return ret;
        int[] left = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int[] right = new int[ratings.length];
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i < ratings.length - 1 && ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(left[i], right[i]);
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] ratings = new int[]{1, 0, 2};
        Demo135 d = new Demo135();
//        int candy = d.candy(ratings);
        int candy = d.candy2(ratings);
        System.out.println(candy);
    }
}
