package com.xlccc.lee;

/**
 * @author Linker
 * @date 2020/12/23 17:27
 * @description：387.字符串中的第一个唯一字符
 */
public class Demo387 {
    public int firstUniqChar(String s) {
        int[] stringCount = new int['z' - 'a'+ 1];
        for (int i = 0; i < s.length(); i++) {
            stringCount[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (stringCount[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Demo387 d = new Demo387();
        String s = "z";
        int i = d.firstUniqChar(s);
        System.out.println(i);
    }
}
