package com.springboot.graddle.springbootgraddle;

import com.springboot.graddle.repository.EmployeeRepository;
import com.springboot.graddle.repository.IEmployeeRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeansConfiguration {

    @Bean
    IEmployeeRepository getEmployeeRepository () {
        return new EmployeeRepository();
    }

}