package com.employee.employeecrud.service;

import com.employee.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee updateEmployee(Long eid, Employee employee);

    public Employee createEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(Long eid);

    public void deleteEmployeeById(Long eid);
}
