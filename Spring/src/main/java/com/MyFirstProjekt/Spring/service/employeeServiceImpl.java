package com.MyFirstProjekt.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyFirstProjekt.Spring.model.Employee;
import com.MyFirstProjekt.Spring.repository.employeeReository;

@Service
public class employeeServiceImpl implements employeeService{
    @Autowired
    private employeeReository employeeReository;
    @Override
    public List<Employee> getAllEmployee() {
      return employeeReository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeReository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional <Employee> optional= employeeReository.findById(id);
        Employee employee= null;
        if(optional.isPresent()){
            employee=optional.get();
        }else{
            throw new RuntimeException("Employee not fund");
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeReository.deleteById(id);
    }
   
}