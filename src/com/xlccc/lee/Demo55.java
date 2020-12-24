package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/24 14:05
 * @description：
 */
public class Demo55 {
    public boolean canJump(int[] nums) {
        int finalPoint = nums.length - 1;
        int tempPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= tempPoint) {
                tempPoint = Math.max(tempPoint, i + nums[i]);
                if (tempPoint >= finalPoint) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 贪心算法 一次循环不断变更最长有效范围
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        int finalPoint = nums.length - 1;
        int tempPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= tempPoint) {
                //变更最大长度
                if (tempPoint < i + nums[i]) {
                    tempPoint = i + nums[i];
                }
                if (tempPoint >= finalPoint) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int[] nums2 = new int[]{3, 2, 1, 0, 4};
        int[] nums3 = new int[]{0};
        Demo55 d = new Demo55();
        boolean b = d.canJump2(nums3);
        System.out.println(b);
    }
}
