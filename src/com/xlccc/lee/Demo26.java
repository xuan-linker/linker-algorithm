package com.xlccc.lee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Linker
 * @date 2021/1/1 0:05
 * @description：
 */
public class Demo26 {
    public int removeDuplicates(int[] nums) {
        HashSet set = new HashSet();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (set.contains(nums[i])) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                length--;
                i--;
            } else {
                set.add(nums[i]);
            }
        }

        return length;
    }


    public static void main(String[] args) {
//        int[] test1 = new int[]{1, 1, 2};
        int[] test2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] test3 = new int[]{};
        Demo26 d = new Demo26();
        int i = d.removeDuplicates(test3);
        System.out.println(i);
    }
}
