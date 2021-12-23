package com.springboot.graddle.repository;

import com.springboot.graddle.model.EmployeeModel;
import com.springboot.graddle.springbootgraddle.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeRepository implements IEmployeeRepository{
    private static final Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);
    @Override
    public void Save(EmployeeModel model) {
        logger.error("saving the model :\n"+model);
    }

    @Override
    public EmployeeModel GetEmployee(int id) {
        logger.error("fetching the employee model for employee id :\n"+id);
        var m =  new EmployeeModel();
        m.name = "venkat";
        m.age = 12;
        return m;
    }
}
