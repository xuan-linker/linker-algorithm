package com.xlccc.cc.homework.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 5/7/2021 10:19 PM
 * @description：
 */
public class ReserveList {

    public static <E> List<E> reverse(List<E> list) {
        List<E> resList = new ArrayList<>();
        int i = list.size()-1;
        //getHead()
        E element = list.get(i);
        while (element != null ) {
            resList.add(element);
            if (i<=0){
                break;
            }
            element = list.get(--i);
        }
        return resList;
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(i);
        }
        System.out.println(numList.toString());
        List<Integer> result = reverse(numList);
        System.out.println(result.toString());
    }
}
