package de.borisskert.spring.springredisexample;

import org.springframework.data.redis.core.RedisHash;

import java.util.Objects;

@RedisHash("Student")
public class Student {

    private String id;
    private String name;
    private Integer grade;

    public Student(String id, String name, Integer grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade);
    }
}
