package com.xlccc.pta.c3;

import static com.xlccc.pta.c3.Common.SC;

/**
 * @author Linker
 * @date 2020/8/5 15:45
 * @description：
 */
public class Ex3_7 {
    public static void main(String[] args) {
        int score = SC.nextInt();
        if (score>=90){
            System.out.println("A");
        }else  if (score>=80){
            System.out.println("B");
        }else  if (score>=70){
            System.out.println("C");
        }else  if (score>=60){
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }
}
