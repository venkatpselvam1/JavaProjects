package com.springboot.graddle.repository;

import com.springboot.graddle.model.EmployeeModel;

public interface IEmployeeRepository {
    void Save(EmployeeModel model);
    EmployeeModel GetEmployee(int id);
}
