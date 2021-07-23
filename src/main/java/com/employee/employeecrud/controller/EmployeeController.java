package com.employee.employeecrud.controller;

import com.employee.employeecrud.entity.Employee;
import com.employee.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long eid){
        return employeeService.getEmployeeById(eid);
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long eid){
        employeeService.deleteEmployeeById(eid);
        return "Employee Successfully deleted";
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long eid,
                                       @RequestBody Employee employee){

        return employeeService.updateEmployee(eid,employee);
    }
}
