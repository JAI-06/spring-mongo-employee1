package com.example.springmongoemployee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.springmongoemployee.model.Employee;
import com.example.springmongoemployee.service.EmployeeService;

@Controller
@ResponseBody


public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/displayAll")
    public List<Employee> displayAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/display/{id}")
    public Employee displayById(@PathVariable String id) {
        return service.getEmployeeById(id);
    }
}
