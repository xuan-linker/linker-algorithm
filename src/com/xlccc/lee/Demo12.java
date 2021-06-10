package com.xlccc.lee;

public class Demo12 {
    public String intToRoman(int num) {
        int[] nums = {1000, 500, 100, 50, 10, 5, 1};
        String[] strings = {"M", "D", "C", "L", "X", "V", "I"};

        int[] appendNums = {900, 400, 90, 40, 9, 4, Integer.MAX_VALUE};
        String[] appendStr = {"CM", "CD", "XC", "XL", "IX", "IV"};
        StringBuffer sb = new StringBuffer();
        if (num == 4) {
            return "IV";
        } else if (num == 9) {
            return "IX";
        } else if (num == 40) {
            return "XL";
        } else if (num == 90) {
            return "XC";
        } else if (num == 400) {
            return "CD";
        } else if (num == 900) {
            return "CM";
        } else {
            int count = 0;
            while (num > 0 && count <= nums.length - 1) {
                if (getMaxNum(num) == appendNums[count]) {
                    num -= appendNums[count];
                    sb.append(appendStr[count]);
                } else if (num >= nums[count]) {
                    num -= nums[count];
                    sb.append(strings[count]);
                } else {
                    count++;
                }
            }
        }
        return sb.toString();
    }

    private int getMaxNum(int num) {
        int count = 0;
        while (num > 10) {
            count++;
            num /= 10;
        }
        return (int) (num * Math.pow(10, count));
    }


    public static void main(String[] args) {
        Demo12 demo12 = new Demo12();
        String s = demo12.intToRoman(58);
        System.out.println(s);
    }
}
