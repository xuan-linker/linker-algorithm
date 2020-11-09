package com.xlccc.data.structure.and.algorithms;

/**
 * @author Linker
 * @date 2020/11/6 15:13
 * @description：二分查找变形问题
 */
public class BinarySearch {
    /**
     * 查找第一个值等于给定值的元素
     * 查找最后一个值等于给定值的元素
     * 查找第一个大于等于给定值的元素
     * 查找最后一个小于等于给定值的元素
     */


    /**
     * 简单的二分查找
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int binarySearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 查找第一个元素是指定元素
     *
     * @param a
     * @param n
     * @param value
     * @return
     */

    public int binarySearch2(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < n && a[low] == value)
            return low;
        else
            return -1;

    }

    /**
     * 按照从小到大排序，第一个为指定value
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int binarySearch3(int[] a, int n, int value) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
//            int mid = (high + low) / 2;
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                //因为此队列是有序的，且相同的数据都是紧密相连的 ，例如 1,2,2,3,3,3,4,5,6
                if ((mid == 0) || (a[mid - 1] != value)) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 从大到小的有序队列,最后一个为指定value
     *
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int binarySearch4(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                low = mid + 1;
            } else if (a[mid] < value) {
                high = mid - 1;
            } else {
                if ((mid == 0) || (a[mid + 1] < value))
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] sourceArr = {1, 2, 3,3, 4, 5, 6, 7, 8, 9};
//        BinarySearch bs = new BinarySearch();
//        int i = bs.binarySearch3(sourceArr, 9, 7);
//        System.out.println(i);

        int[] sourceArr = {9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 0};
        BinarySearch bs = new BinarySearch();
        int i = bs.binarySearch4(sourceArr, 11, 3);
        System.out.println(i);
    }
}
