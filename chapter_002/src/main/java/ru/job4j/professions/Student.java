package ru.job4j.professions;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
       this.name = name;
       this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
