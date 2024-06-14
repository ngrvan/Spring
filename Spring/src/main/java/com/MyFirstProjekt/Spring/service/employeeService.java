package com.MyFirstProjekt.Spring.service;

import java.util.List;

import com.MyFirstProjekt.Spring.model.Employee;

public interface employeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}