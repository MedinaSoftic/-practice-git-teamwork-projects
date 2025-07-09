package com.example.classmanager.model;

public class Teacher {
    private String name;
    private int age;
    private String employeeId;

    public Teacher(String name, int age, String employeeId) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
