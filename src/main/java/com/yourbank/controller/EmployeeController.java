package com.yourbank.controller;


import com.yourbank.model.Employee;
import com.yourbank.repo.EmployeeRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping("/")
    public List<Employee> getAllEmp(HttpServletRequest request){

        return employeeRepo.findAll();
    }

    @PostMapping("/add")
    public Employee add(HttpServletRequest request, @RequestBody Employee employee){
        return employeeRepo.save(employee);
    }
}
