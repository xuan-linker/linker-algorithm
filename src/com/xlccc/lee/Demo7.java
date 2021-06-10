package com.xlccc.lee;

public class Demo7 {
    public int reverse(int x) {
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = Math.abs(x
            );
        }
        String number = String.valueOf(x);
        System.out.println(number);
        String result = "";
        boolean firstZero = true;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(number.length() - 1 - i);
            if (firstZero && c == '0') {
                continue;
            }
            result += c;
            firstZero = false;
        }
        if (result != "") {
            int numRes = 0;
            try {
                numRes = flag * Integer.valueOf(result);
            } catch (NumberFormatException e) {
                return 0;
            }
            return numRes;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Demo7 d = new Demo7();
        int reverse = d.reverse(1534236469);
        System.out.println(reverse);

    }
}
