package com.springdemo.lab4postgres.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "\n{"  +
                "\n id=" + id +
                "\n, name='" + name + '\'' +
                "\n, age=" + age +
                "\n, gender='" + gender  + '\'' +
                "\n}";
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public Students(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    public Students() {
    }
}
