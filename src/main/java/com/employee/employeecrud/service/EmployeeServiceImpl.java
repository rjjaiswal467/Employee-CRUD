package com.employee.employeecrud.service;

import com.employee.employeecrud.entity.Employee;
import com.employee.employeecrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee updateEmployee(Long eid, Employee employee) {
        Employee employee1 = employeeRepository.findById(eid).get();


            employee1.setSalary(employee.getSalary());

        return employeeRepository.save(employee1);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long eid) {
        return employeeRepository.findById(eid).get();
    }

    @Override
    public void deleteEmployeeById(Long eid) {
        employeeRepository.deleteById(eid);
    }
}
