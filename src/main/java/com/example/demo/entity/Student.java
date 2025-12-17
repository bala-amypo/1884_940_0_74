package com.example.demo.entity;

public class Student {
    private long int id;
    private String name;
    private String email;
    
    public Student(long int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long int getId() {
        return id;
    }
    public void setId(long int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}