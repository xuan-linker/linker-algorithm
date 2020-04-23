package com.xlccc.basic;

/**
 * @Author Linker
 * @Date 2020/4/23 1:28 下午
 * @Version 1.0
 */
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int resultWhile = binarySearchWhile(arr, 0, 9, 2);
        System.out.println("binarySearchWhile:" + resultWhile);

        int resultRecursion = binarySearchRecursion(arr, 2, 2, 3);
        System.out.println("resultRecursion:" + resultRecursion);
    }

    public static int binarySearchWhile(int[] arr, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int ret = -1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                ret = mid;
                break;
            }
        }
        return ret;
    }

    public static int binarySearchRecursion(int[] arr, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] > key) {
            return binarySearchRecursion(arr, start, mid - 1, key);
        } else if (arr[mid] < key) {
            return binarySearchRecursion(arr, mid + 1, end, key);
        } else {
            return mid;
        }
    }

}
