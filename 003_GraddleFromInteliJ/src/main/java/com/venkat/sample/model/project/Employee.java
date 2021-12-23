package com.venkat.sample.model.project;

public class Employee {
    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
