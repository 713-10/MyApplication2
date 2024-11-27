package com.example.myapplication;

public class Student {
    private final String name;
    private final int age;
    private final int grade;
    private final String major;

    public Student(String name, int age, int grade, String major) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }
}
