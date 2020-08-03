package com.xlccc.pta.c3;

/**
 * @author Linker
 * @date 2020/8/3 21:12
 * @description：
 */
public class Ex8_8 {
    public static void main(String[] args) {

        char s[] = "thisisnottrue".toCharArray();
        if (palindrome(s) == true){
            System.out.println("true");
        }else
        {
            System.out.println("No\n" );
        }

    }

    public static boolean palindrome(char s[]) {
        for (int i = 0; i < s.length/2; i++) {
            if (s[i] != s[s.length-1-i] && (s[i]<=s[s.length-1-i])){
                return false;
            }
        }
        return true;
    }
}
