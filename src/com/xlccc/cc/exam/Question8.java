package com.xlccc.cc.exam;

/**
 * @author Linker
 * @description：
 */
public class Question8 {
    public static class Student {
        private String id;
        private String firstName;
        private String lastName;

        public Student(String fName, String lName, String id) {
            this.firstName = fName;
            this.lastName = lName;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Student) {
                Student s = (Student) o;
                if (this.id.equals(s.id)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mark", "Smith", "10001");
        Student s2 = new Student("Mark", "Smith", "10002");
        Student s3 = s1;
        Student s4 = new Student("Marty", "McFly", "10001");
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 .equals s2 : " + (s1.equals(s2)));
        System.out.println("s3 == s1 : " + (s3 == s1));
        System.out.println("s3 .equals s1 : " + (s3.equals(s1)));
        System.out.println("----");
        System.out.println("s1 == s4 : " + (s1 == s4));
        System.out.println("s1 .equals s4 : " + (s1.equals(s4)));
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3 .equals s4 : " + (s3.equals(s4)));

    }
}
