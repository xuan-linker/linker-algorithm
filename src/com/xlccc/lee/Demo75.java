package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/22 11:16
 * @description：75. 颜色分类
 */
public class Demo75 {
    public void sortColors(int[] nums) {
        int p = 0;
        int q = nums.length - 1;
        if (nums.length < 2) {
            return;
        }

        for (int i = 0; i <= q; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[p];
                nums[p] = 0;
                ++p;
            }
            if (nums[i] == 2) {
                nums[i] = nums[q];
                nums[q] = 2;
                --q;
                if (nums[i] != 1) {
                    --i;
                }
            }
        }
        return;

    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] nums = new int[]{1, 2, 0};
        Demo75 d = new Demo75();
        d.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(" " + nums[i]);

        }
    }
}
