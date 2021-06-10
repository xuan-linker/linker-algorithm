package com.xlccc.lee;

public class Demo11 {
    public int maxArea(int[] height) {
        int maxContent = -1;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int content = Math.min(height[left], height[right]) * (right - left);
            if (content > maxContent) {
                maxContent = content;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxContent;
    }
    public int maxArea2(int[] height) {
        int maxContent = -1;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int content = (j - i) * Math.min(height[i], height[j]);
                if (content>maxContent){
                    maxContent = content;
                }
            }
        }
        return maxContent;
    }
}
