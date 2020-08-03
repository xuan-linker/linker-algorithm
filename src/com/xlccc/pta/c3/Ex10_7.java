package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/3 23:01
 * @description：
 */
public class Ex10_7 {
    public static void main(String[] args) {

        int n = SC.nextInt();
        dectobin(n);

    }
    static String str = "";

    public static void dectobin(int n) {

        if (n==1 || n == 0){
            str=n+str;
            System.out.println(str);
//            System.out.printf(n +"");
        }else {
            str=n%2+str;

//            System.out.printf(n%2+"");
            dectobin(n/2);
        }

    }
}
