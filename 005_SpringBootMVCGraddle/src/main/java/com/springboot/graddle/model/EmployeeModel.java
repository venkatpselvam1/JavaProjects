package com.springboot.graddle.model;

public class EmployeeModel {
    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "EmployeeModel\n{\n" +
                "\nname='" + name + '\'' +
                ",\nage=" + age +
                "\n}";
    }
}
