package com.xlccc.sys.select;

/**
 * @author Linker
 * @date 2020/10/13 16:01
 * @description：
 */
public class SelectionSort {
    public SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        // arr[0...i) 是有序的; arr[i...n) 是无序的
        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中的最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
//        //
//        Integer[] arr = {1, 4, 2, 3, 6, 5};
//        SelectionSort.sort(arr);
//        for (int e : arr
//        ) {
//            System.out.println(e + " ");
//        }
//        System.out.println();
//
//        //
//        Student[] students = {new Student("a", 1),
//                new Student("b", 2),
//                new Student("c", 3)};
//        SelectionSort.sort(students);
//        for (Student s : students
//        ) {
//            System.out.println(s);
//
//        }
//        System.out.println(Arrays.toString(arr));
        //

        int[] dataSize = {10000,100000};
        for (int n : dataSize
             ) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }
    }
}
