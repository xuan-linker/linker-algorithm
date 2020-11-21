package com.xlccc.cc.exam;

/**
 * @author Linker
 * @description：
 */
public class Question13 {
    public static class IntSet {
        private int[] data;
        private int MAX;
        private int count;

        public IntSet() {
            this.MAX = 32;
            this.data = new int[MAX];
            this.count = 0;
        }

        public IntSet(int n) {
            MAX = n;
            data = new int[MAX];
            count = 0;
        }

        public void add(int x) {
            if (hasElement(x)) return;
            data[count] = x;
            count++;
        }

        public boolean hasElement(int x) {
            if (count == 0) return false;
            for (int i = 0; i < count; i++) {
                if (data[i] == x) {
                    return true;
                }
            }
            return false;
        }
    }

    public static IntSet union(IntSet intSet, IntSet otherSet) {

        IntSet resSet = new IntSet();
        //init
        resSet.MAX = intSet.MAX + otherSet.MAX;
        resSet.count = intSet.count;
        resSet.data = new int[resSet.MAX];
        //move intSet into resSet
        for (int i = 0; i < intSet.count; i++) {
            resSet.data[i] = intSet.data[i];
        }
        //add otherSet into resSet
        for (int i = 0; i < otherSet.count; i++) {
            if (!intSet.hasElement(otherSet.data[i])) {
                resSet.data[resSet.count++] = otherSet.data[i];
            }
        }
        return resSet;
    }

    public static void main(String[] args) {
        Question13 q = new Question13();
        IntSet set1 = new IntSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        IntSet set2 = new IntSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        IntSet resSet = union(set1, set2);
        for (int i = 0; i < resSet.count; i++) {
            System.out.println(resSet.data[i]);
        }
    }
}
