package com.xlccc.lee;

public class Demo13 {
    public int romanToInt(String s) {
        int[] nums = {1000, 500, 100, 50, 10, 5, 1};
        String[] strings = {"M", "D", "C", "L", "X", "V", "I"};

        int[] appendNums = {900, 400, 90, 40, 9, 4, Integer.MAX_VALUE};
        String[] appendStr = {"CM", "CD", "XC", "XL", "IX", "IV"};
        int result = 0;
        int count = 0;
        while (s.length() > 0) {
            if (s.length() > 2) {
                int flag = -1;
                String substring = s.substring(0, 1);
                for (int i = count; i < appendStr.length; i++) {
                    if (appendStr[count] == substring) {
                        result += appendNums[count];
                        s = s.substring(2);
                        flag =1;
                        continue;
                    }

                }
                if (flag == 1){
                    continue;
                }
            }
            for (int i = count; i < strings.length; i++) {
                if (strings[count] == s.substring(0, 0)) {
                    result += nums[count];
                    if (s.length() > 1) {
                        s = s.substring(1);
                    } else {
                        return result;
                    }
                }
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Demo13 demo13 = new Demo13();
        int iii = demo13.romanToInt("III");
        System.out.println(iii);
    }
}
