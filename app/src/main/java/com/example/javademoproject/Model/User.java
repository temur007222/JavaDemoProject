package com.example.javademoproject.Model;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    int age;

    public User(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
