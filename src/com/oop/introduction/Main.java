package com.oop.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        // just declaring
        // Student ankit;
        // ankit = new Student();
        Student ankit = new Student(22,"Ankit Sharma",90.4f);

        System.out.println(ankit.rno);
        System.out.println(ankit.name);
        System.out.println(ankit.marks);

        Student random = new Student(ankit);
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);


    }
}
// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student() {
        // this is how you call a constuctor from another constructer
        // internally : new Student(13,"default person",100.0f);
        this (13,"default person",100.0f);
    }
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks=other.marks;
    }
    void greeting() {
        System.out.println("Hello, My name is "+this.name);
    }
    void changeName() {
        this.name = name;
    }
}