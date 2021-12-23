package com.springboot.graddle.springbootgraddle;

import com.springboot.graddle.model.EmployeeModel;
import com.springboot.graddle.repository.EmployeeRepository;
import com.springboot.graddle.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    public IEmployeeRepository empRepo;

    public EmployeeController(IEmployeeRepository empRepo)
    {
        this.empRepo = empRepo;
    }
    @GetMapping("/employee")
    public String GetEmployee(@RequestParam(name = "empid", defaultValue = "1")String empId)
    {
        int empIdInt = Integer.parseInt(empId);
        return empRepo.GetEmployee(empIdInt).toString();
    }
}
