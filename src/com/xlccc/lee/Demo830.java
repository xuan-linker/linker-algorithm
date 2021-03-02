//package com.xlccc.lee;
//
//import com.xlccc.data.structure.and.algorithms.linkedlist.homework.LinkedList;
//import com.xlccc.data.structure.and.algorithms.linkedlist.homework.List;
//
//import java.util.ArrayList;
//
///**
// * @author Linker
// * @date 2021/1/5 9:32
// * @description：
// */
//public class Demo830 {
//    public List<List<Integer>> largeGroupPositions(String s) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        int length = s.length();
//        int begin = -1;
//        int end = -1;
//        for (int i = 0; i < length; i++) {
//            begin = i;
//            end = i + 1;
//            while (end < length && s.charAt(end) == s.charAt(begin)) {
//                end++;
//                i++;
//            }
//            if ((end - begin) >= 3) {
//                List<Integer> list = new LinkedList();
//                list.add(begin);
//                list.add(end);
//                result.add(list);
//
//            }
//
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String s = "abbxxxxzzy";
//        Demo830 d = new Demo830();
//        List<List<Integer>> listList = d.largeGroupPositions(s);
//        for (int i = 0; i < listList.size(); i++) {
//
//            System.out.println(listList.get(i));
//        }
//
//
//        List<Integer> list = new ArrayList<Integer>();
//    }
//}
