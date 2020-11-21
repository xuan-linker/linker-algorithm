//package com.xlccc.cc;
//
///**
// * @author Linker
// * @date 2020/11/9 18:00
// * @description：MyListTest
// */
//public class MyListTest {
//    /**
//     * Init for test, add data for list.
//     *
//     * @return MyStringList
//     */
//    public static MyStringList initList() {
//        MyStringList.head = new SNode();
//        MyStringList list = new MyStringList();
//        //init data
//        list.insert("Hello");
//        list.insert("hello");
//        list.insert("hello");
//        list.insert("HELLO");
//        return list;
//    }
//
//    /**
//     * Init for test, without any data.
//     *
//     * @return empty list
//     */
//    public static MyStringList initEmptyList() {
//        MyStringList.head = new SNode();
//        MyStringList list = new MyStringList();
//        return list;
//    }
//
//    /**
//     * Test for firstNode with empty list.
//     *
//     * @return PASS or FAIL
//     */
//    public static String firstEmptyTest() {
//        //init without no data
//        MyStringList list = new MyStringList();
//        SNode sNode = list.firstNode();
//        if (sNode == null) {
//            return "PASS";
//        } else {
//            return "FAIL";
//        }
//    }
//
//    /**
//     * Test for firstNode with list include data .
//     *
//     * @return PASS or FAIL
//     */
//    public static String firstNotEmptyTest() {
//        //init without data
//        MyStringList list = initList();
//        SNode sNode = list.firstNode();
//        if (sNode != null) {
//            return "PASS";
//        } else {
//            return "FAIL";
//        }
//    }
//
//    /**
//     * Test for success insert.
//     *
//     * @return PASS or FAIL
//     */
//    public static String insertTest() {
//        MyStringList list = initEmptyList();
//        if (MyStringList.head.getNextNode() != null) {
//            return "FAIL";
//        }
//
//        list.insert("Hello");
//
//        if (MyStringList.head.getNextNode() != null) {
//            return "PASS";
//        } else {
//            return "FAIL";
//        }
//    }
//
//    /**
//     * Test for inset order.
//     *
//     * @return
//     */
//    public static String insertOrderTest() {
//        String trueResult = "MyStringList :  [ data : HELLO ,count : 1 ]  [ data : Hello ,count : 1 ]  [ data : hello ,count : 1 ] ";
//
//        //first
//        MyStringList.head = new SNode();
//        MyStringList list = new MyStringList();
//        list.insert("hello");
//        list.insert("Hello");
//        list.insert("HELLO");
//        if (!list.toString().equals(trueResult)) {
//            return "FAIL";
//        }
//
//        //second
//        MyStringList.head = new SNode();
//        list.insert("hello");
//        list.insert("HELLO");
//        list.insert("Hello");
//        if (!list.toString().equals(trueResult)) {
//            return "FAIL";
//        }
//
//        //third
//        MyStringList.head = new SNode();
//        list.insert("Hello");
//        list.insert("hello");
//        list.insert("HELLO");
//        if (!list.toString().equals(trueResult)) {
//            return "FAIL";
//        }
//
//        return "PASS";
//    }
//
//    /**
//     * Test for delete
//     *
//     * @return PASS or FAIL
//     */
//    public static String deleteTest() {
//        MyStringList list = initList();
//
//        String key1 = "hello";
//        list.delete(key1);
//        if (list.findCount(key1) != 1) {
//            return "FAIL";
//        }
//        list.delete(key1);
//        if (list.findCount(key1) != 0) {
//            return "FAIL";
//        }
//        list.delete(key1);
//        if (list.findCount(key1) != 0) {
//            return "FAIL";
//        }
//
//        String key2 = "HELLO";
//        list.delete(key2);
//        if (list.findCount(key2) != 0) {
//            return "FAIL";
//        }
//
//        String key3 = "Hello";
//        list.delete(key3);
//        if (list.findCount(key3) != 0) {
//            return "FAIL";
//        }
//        list.delete(key3);
//        if (list.findCount(key2) != 0) {
//            return "FAIL";
//        }
//
//        return "PASS";
//    }
//
//    /**
//     * Test for delete all.
//     *
//     * @return PASS or FAIL
//     */
//    public static String deleteAllTest() {
//        MyStringList.head = new SNode();
//        MyStringList list = new MyStringList();
//
//        String key1 = "none";
//        try {
//            list.delete(key1);
//            int count = list.findCount(key1);
//            if (count != 0) {
//                return "FAIL";
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "FAIL";
//        }
//
//        return "PASS";
//    }
//
//    /**
//     * Test for find count for exist data.
//     *
//     * @return PASS or FAIL
//     */
//    public static String findCountTest() {
//        MyStringList list = initList();
//        int count1 = list.findCount("hello");
//        if (count1 != 2) {
//            return "FAIL";
//        }
//
//        int count2 = list.findCount("HELLO");
//        if (count2 != 1) {
//            return "FAIL";
//        }
//
//        int count3 = list.findCount("Hello");
//        if (count3 != 1) {
//            return "FAIL";
//        }
//
//        return "PASS";
//    }
//
//    /**
//     * Test for find count for none.
//     *
//     * @return
//     */
//    public static String findNoneCountTest() {
//        MyStringList list = new MyStringList();
//        MyStringList.head = new SNode();
//
//        String key = "Linker";
//        int count = list.findCount(key);
//        if (count != 0) {
//            return "FAIL";
//        }
//        return "PASS";
//    }
//
//    public static String toStringTest() {
//        MyStringList list = initList();
//        System.out.println(list.toString());
//        if (list.toString() != null) {
//            return "PASS";
//        } else {
//            return "FAIL";
//        }
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println("-------FirstTest(2)--------");
//        String firstTestResult = firstEmptyTest();
//        System.out.println("FirstEmptyTest : " + firstTestResult);
//        String firstNotEmptyTest = firstNotEmptyTest();
//        System.out.println("FirstNotEmptyTest : " + firstNotEmptyTest);
//
//
//        System.out.println("-------InsertTest(2)--------");
//        String insertTestResult = insertTest();
//        System.out.println("InsertTestResult : " + insertTestResult);
//        String insertOrderTestResult = insertOrderTest();
//        System.out.println("InsertOrderTestResult : " + insertOrderTestResult);
//
//        System.out.println("-------deleteTest(2)--------");
//        String deleteTestResult = deleteTest();
//        System.out.println("DeleteTestResult : " + deleteTestResult);
//
//        String deleteAllTestResult = deleteAllTest();
//        System.out.println("DeleteAllTestResult : " + deleteAllTestResult);
//
//        System.out.println("--------FindCountTest(2)-------");
//        String findCountTestResult = findCountTest();
//        System.out.println("FindCountTestResult : " + findCountTestResult);
//        String noneCountTestResult = findNoneCountTest();
//        System.out.println("NoneCountTestResult : " + noneCountTestResult);
//
//        System.out.println("-------ToStringTestResult(1)--------");
//        String toStringTestResult = toStringTest();
//        System.out.println("ToStringTestResult : " + toStringTestResult);
//
//
//    }
//}
