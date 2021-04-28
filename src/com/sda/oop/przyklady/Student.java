package com.sda.oop.przyklady;

public class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Utworzono obiekt Student");
    }

    private String name;
    private int age;

    public void sayHello() {
        System.out.println("My name is " + name + ", I am " + age + " years old");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
