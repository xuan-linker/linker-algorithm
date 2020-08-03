package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/8/3 21:28
 * @description：
 */
public class Ex8_9 {
    public static void main(String[] args) {
        char s[] = new char[100];
        s = "aZ&*?\n093 Az".toCharArray();
        StringCount(s);

    }

    public static void StringCount(char[] s) {

        int bigChar = 0;
        int smallChar = 0;
        int black = 0;
        int number = 0;
        int otherChar = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                bigChar++;
            } else if (s[i] >= 'a' && s[i] <= 'z') {
                smallChar++;
            } else if (s[i] == ' ') {
                black++;
            } else if (s[i] >= '0' && s[i] <= '9') {
                number++;
            } else {
                otherChar++;
            }
        }

        System.out.println(bigChar + " " + smallChar + " " + black + " " + number + " " + otherChar);
    }
}
