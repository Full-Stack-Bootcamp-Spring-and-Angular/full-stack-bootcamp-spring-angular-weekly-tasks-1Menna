package org.example;

public class Student {
    String name;
    int Id;

    public Student() {
    }
    public Student(String name, int id) {
        this.name = name;
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.Id = id;
    }

}
