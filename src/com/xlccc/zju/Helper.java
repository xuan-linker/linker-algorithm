package com.xlccc.zju;


/**
 * @author Linker
 * @date 2020/11/2 15:38
 * @description：
 */
public class Helper {
    public void showTime(String sortName) {
        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;
        System.out.println(time);

//        if (!SortingHelper.isSorted(arr)) {
//            for (E e : arr
//            ) {
//                System.out.print(e+" ");
//            }
//            throw new RuntimeException(sortName + " failed");
//        }
//        System.out.println(String.format("%s , n= %d : %f s", sortName, arr.length, time));
        System.out.println(String.format("%s , %f s", sortName, time));
    }
}
