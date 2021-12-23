package com.venkat.sample.project;

import com.venkat.sample.model.project.Employee;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        var emp = new Employee();
        emp.name = "venkat";
        emp.age  = 12;
        System.out.println(emp);
    }
}
