package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 21:02
 * @description：
 */
public class Ex8_6 {
    public static void main(String[] args) {

        char str[] = new char[100];

        String input = "happy new year";

        for (int i = 0; i < input.length(); i++) {

            str[i] = input.charAt(i);
        }
        String cDemo = SC.next();
        char c = cDemo.charAt(0);
        delchar(str , c);
    }

    public static void delchar(char[] str, char c) {

        char resultStr[] = new char[100];
        int num = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i] == c) {

            } else {
                resultStr[num] = str[i];
                num++;
            }
        }

        for (int i = 0; i < resultStr.length; i++) {
            System.out.printf(resultStr[i]+"");
        }
        return;
    }
}
