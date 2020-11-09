package com.xlccc.cc;

/**
 * @author Linker
 * @date 2020/11/9 18:00
 * @description：MyListTest
 */
public class MyListTest {
    /**
     * Init for test, add data for list.
     *
     * @return MyStringList
     */
    public static MyStringList initList() {
        MyStringList.head = new SNode();
        MyStringList list = new MyStringList();

        //init data
        list.insert("Hello");
        list.insert("hello");
        list.insert("hello");
        list.insert("HELLO");

        return list;
    }

    /**
     * Init for test, without any data.
     *
     * @return empty list
     */
    public static MyStringList initEmptyList() {
        MyStringList.head = new SNode();
        MyStringList list = new MyStringList();
        return list;
    }

    /**
     * Test for firstNode with empty list.
     *
     * @return success or fail
     */
    public static ResultEnum firstEmptyTest() {
        //init without no data
        MyStringList list = new MyStringList();
        SNode sNode = list.firstNode();
        if (sNode == null) {
            return ResultEnum.success;
        } else {
            return ResultEnum.fail;
        }
    }

    /**
     * Test for firstNode with list include data .
     *
     * @return success or fail
     */
    public static ResultEnum firstNotEmptyTest() {
        //init without data
        MyStringList list = initList();
        SNode sNode = list.firstNode();
        if (sNode != null) {
            return ResultEnum.success;
        } else {
            return ResultEnum.fail;
        }
    }

    /**
     * Test for insert.
     *
     * @return success or fail
     */
    public static ResultEnum insertTest() {
        MyStringList list = initEmptyList();
        if (MyStringList.head.getNextNode() != null) {
            return ResultEnum.fail;
        }

        list.insert("Hello");

        if (MyStringList.head.getNextNode() != null) {
            return ResultEnum.success;
        } else {
            return ResultEnum.fail;
        }
    }

    /**
     * Test for delete
     *
     * @return success or fail
     */
    public static ResultEnum deleteTest() {
        MyStringList list = initList();

        String key1 = "hello";
        list.delete(key1);
        if (list.findCount(key1) != 1) {
            return ResultEnum.fail;
        }
        list.delete(key1);
        if (list.findCount(key1) != 0) {
            return ResultEnum.fail;
        }
        list.delete(key1);
        if (list.findCount(key1) != 0) {
            return ResultEnum.fail;
        }

        String key2 = "HELLO";
        list.delete(key2);
        if (list.findCount(key2) != 0) {
            return ResultEnum.fail;
        }

        String key3 = "Hello";
        list.delete(key3);
        if (list.findCount(key3) != 0) {
            return ResultEnum.fail;
        }
        list.delete(key3);
        if (list.findCount(key2) != 0) {
            return ResultEnum.fail;
        }

        return ResultEnum.success;
    }


    /**
     * Test for findCount
     *
     * @return success or fail
     */
    public static ResultEnum findCountTest() {
        MyStringList list = initList();
        int count1 = list.findCount("hello");
        if (count1 != 2) {
            return ResultEnum.fail;
        }

        int count2 = list.findCount("HELLO");
        if (count2 != 1) {
            return ResultEnum.fail;
        }

        int count3 = list.findCount("Hello");
        if (count3 != 1) {
            return ResultEnum.fail;
        }

        return ResultEnum.success;
    }

    public static ResultEnum toStringTest() {
        MyStringList list = initList();
        System.out.println(list.toString());
        if (list.toString() != null) {
            return ResultEnum.success;
        } else {
            return ResultEnum.fail;
        }
    }

    public static void main(String[] args) {
        System.out.println("-------FirstTest--------");
        ResultEnum firstTestResult = firstEmptyTest();
        System.out.println("FirstEmptyTest : " + firstTestResult.getMessage());
        ResultEnum firstNotEmptyTest = firstNotEmptyTest();
        System.out.println("FirstNotEmptyTest : " + firstNotEmptyTest.getMessage());

        System.out.println("-------InsertTest--------");
        ResultEnum insertTestResult = insertTest();
        System.out.println("InsertTestResult : " + insertTestResult);

        System.out.println("-------deleteTest--------");
        ResultEnum deleteResultEnum = deleteTest();
        System.out.println("DeleteTest : " + deleteResultEnum);

        System.out.println("--------FindCountTest-------");
        ResultEnum findCountTestResult = findCountTest();
        System.out.println("FindCountTestResult : " + findCountTestResult);

        System.out.println("-------ToStringTestResult--------");
        ResultEnum toStringTestResult = toStringTest();
        System.out.println("ToStringTestResult : " + toStringTestResult);

    }
}
