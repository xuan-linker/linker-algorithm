package com.xlccc.cc.exam;

/**
 * @author Linker
 * @description：
 */
public class Question7 {
    public static class Bird {
        public void sing() {
            System.out.println("???");
        }
    }

    public static class Duck extends Bird {
        public void sing() {
            System.out.println("QUACK");
        }
    }

    public static class Turkey extends Bird {
        public void sing() {
            System.out.println("GOBBLE");
        }
    }

    public static void main(String[] args) {
        Bird a = new Bird();
        a.sing();
        System.out.println("----");
        Bird b = new Duck();
        b.sing();
        System.out.println("----");
        Bird c = new Turkey();
        c.sing();
        System.out.println("---");
        Duck d = new Duck();
        d.sing();
    }
}

