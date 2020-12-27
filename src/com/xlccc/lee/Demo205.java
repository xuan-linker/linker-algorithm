package com.xlccc.lee;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Linker
 * @date 2020/12/27 19:13
 * @description：
 */
public class Demo205 {
    /**
     * 给定两个字符串 s 和 t，判断它们是否是同构的。
     * <p>
     * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
     * <p>
     * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
     * <p>
     * 示例 1:
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/isomorphic-strings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != map2.get(map1.get(s.charAt(i)))) {
                return false;
            }
            newString += map1.get(s.charAt(i));
        }
        if (newString.equals(t)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Demo205 d = new Demo205();
        String s = "ab", t = "aa";
        boolean isomorphic = d.isIsomorphic(s, t);
        System.out.println(isomorphic);
//        HashMap<Character, Character> map = new HashMap<>();
//        Character character = map.get("1");
//        System.out.println(character);

    }
}
