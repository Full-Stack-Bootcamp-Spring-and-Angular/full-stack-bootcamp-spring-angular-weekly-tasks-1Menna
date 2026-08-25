package com.myApp;

public class Student {
    int id;
    String name;
    double GPA;

    public Student(int id, String name, double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    public Student() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
}
