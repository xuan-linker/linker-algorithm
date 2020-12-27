package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/27 20:19
 * @description：
 */
public class Demo58 {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if (s1.length == 0) {
            return 0;
        } else {
            String str = s1[s1.length-1];
            return str.length();
        }
    }

    public static void main(String[] args) {
        String s = "Hello World";
        Demo58 d = new Demo58();
        int i = d.lengthOfLastWord(s);
        System.out.println(i);
    }
}
