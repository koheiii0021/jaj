package com.example.app;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("僕の名前は：" + name + "です");
    }
}
