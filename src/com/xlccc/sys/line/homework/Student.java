package com.xlccc.sys.line.homework;

import java.util.Objects;

/**
 * @author Linker
 * @date 2020/10/13 10:57
 * @description：
 */
public class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
