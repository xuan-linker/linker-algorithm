//package com.xlccc.lee;
//
///**
// * @author Linker
// * @date 2021/1/22 10:36
// * @description：
// */
//public class Demo38 {
//    public String countAndSay(int n) {
////        String number = Integer.toString(n);
//////        int[] nums = new int[];
////        String[] strNums = new String[number.length()];
////
////        StringBuilder resultStr = new StringBuilder();
////
////        //只有一位数字时
////        if (number.length() == 1) {
////            return "1" + number;
////        }
////        ArrayList<Character> tempCharList = new ArrayList<Character>();
////        tempCharList.add(number.charAt(0));
////        for (int i = 1; i < number.length(); i++) {
////            if (number.charAt(i) != tempCharList.get(0)) {
////                int length = tempCharList.size();
////                Character tempChar = tempCharList.get(0);
////                resultStr.append(length + tempChar);
////
////                tempCharList.clear();
////            } else {
////                tempCharList.add(number.charAt(i));
////            }
////        }
////        if (tempCharList.size() > 0) {
////            int length = tempCharList.size();
////            Character tempChar = tempCharList.get(0);
////            resultStr.append(length + tempChar);
////
////            tempCharList.clear();
////        }
////
////        return resultStr.toString();
//
//        StringBuilder tempSb = new StringBuilder();
//        if (n == 1) {
//            return "1";
//        }
//        tempSb.append(1);
//        for (int i = 1; i < n; i++) {
//
//
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Demo38 d = new Demo38();
//        String s = d.countAndSay(4);
//        System.out.println(s);
//    }
//}
