//package com.xlccc.pta.c3;
//
///**
// * @author Linker
// * @date 2020/7/27 1:00
// * @description：
// */
//public class Ex8_5 {
//    public static void main(String[] args) {
//
//    }
//
//    public static void Goldbach(int n) {
//
//
//    }
//
//    public static int prime(int p) {
//
//        //1不是素数，2是素数。
//        if (p <= 1) {
//            return 0;
//        }
//        if (p == 2) {
//            return 1;
//        }
//        for (int i = 2; i < Math.sqrt(p); i++) {
//            //能整除 不是素数
//            if (p % i == 0) {
//                return 0;
//            }
//        }
//        //是素数
//        return 1;
//    }
//}
