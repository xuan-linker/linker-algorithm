package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/7/25 20:05
 * @description：习题6-1 分类统计字符个数 (15分)
 */
public class Ex6_1 {//??

    public static void main(String[] args) {
//        char s[] = new char[100];
//        String str = "";
//        while (Common.sc.hasNext()) {
//            str += Common.sc.next();
//        }
//        for (int i = 0; i < str.length(); i++) {
//            s[i] = str.charAt(i);
//        }
//        void ReadString( char s[] ); /* 由裁判实现，略去不表 */

//        StringCount(s);
    }

    public static void StringCount(char s[]) {
        int letter = 0, blank = 0, digit = 0, other = 0;

        for (char sc : s
        ) {
            if ((sc >= 'a' && sc <= 'z') || (sc >= 'A' && sc <= 'Z')) {
                letter++;
            } else if (sc == '\n' || sc == '\t') {
                blank++;
            } else if (sc >= '0' && sc <= '9') {
                digit++;
            } else {
                other++;
            }
            System.out.println("letter = " + letter + ", blank = " + blank + ", digit = " + digit + ", other = " + other + "\n");

        }
    }

}
