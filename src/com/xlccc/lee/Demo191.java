package com.xlccc.lee;

public class Demo191 {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i))!=0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Demo191 d = new Demo191();
        int i = d.hammingWeight(00000000000000000000000000001011);
        System.out.println(i);

    }
}
