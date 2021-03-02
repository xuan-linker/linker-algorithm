package com.xlccc.lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Linker
 * @date 2020/12/29 9:07
 * @description：
 */
public class Demo56 {
    public int[][] merge(int[][] intervals) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                nums.add(j);
            }
        }

        List<int[]> result = new ArrayList<>();
        Collections.sort(nums);
        int[] tempInterval = {-1, -1};
        for (int i = 0; i < nums.size(); i++) {
            //|| tempInterval[1] != nums.get(i) - 1
            if (tempInterval[1] == -1) {
                tempInterval = new int[]{nums.get(i), nums.get(i)};
            } else if (tempInterval[1] == nums.get(i) - 1) {
                tempInterval[1] = nums.get(i);
            } else if (tempInterval[1] >= nums.get(i)) {
                continue;
            } else {
                //if (tempInterval[1] != nums.get(i) - 1)
                result.add(tempInterval);
                tempInterval = new int[]{nums.get(i), nums.get(i)};
            }

        }
        if (tempInterval[1] != -1 && tempInterval[1] == nums.get(nums.size() - 1) - 1) {
            tempInterval[1] = nums.get(nums.size() - 1);
            result.add(tempInterval);
        }else if (tempInterval[1]!=-1 ){
            result.add(tempInterval);
        }
        int count = 0;
        int[][] mergeIntervals = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            mergeIntervals[count++] = result.get(i);
        }

        return mergeIntervals;


    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Demo56 d = new Demo56();
        int[][] merge = d.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(Arrays.toString(merge[i]));
        }
    }
}
