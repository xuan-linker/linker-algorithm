package com.xlccc.sys.line;

import com.xlccc.sys.line.homework.Student;

/**
 * @author Linker
 * @date 2020/10/13 10:33
 * @description：线性查找
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dataSize = {1000000, 10000000};
        for (int n : dataSize
        ) {
//            n = 1000000;
            Integer[] data = ArrayGenerator.generatorOrderedArray(n);

            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++) {
                LinearSearch.search(data, n);
            }
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + time + " s");
        }

//        Integer[] data = {24, 18, 12, 9, 16, 66, 232, 4};

//        int res = LinearSearch.search(data, 16);
//        System.out.println(res);
//
//        int res2 = LinearSearch.search(data, 111);
//        System.out.println(res2);

        Student[] students = {
                new Student(1, "a"),
                new Student(2, "b"),
                new Student(3, "c")
        };
        Student b = new Student(2, "b");
        int res3 = LinearSearch.search(students, b);
        System.out.println(res3);

    }
}
