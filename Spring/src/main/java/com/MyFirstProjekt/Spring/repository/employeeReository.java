package com.MyFirstProjekt.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyFirstProjekt.Spring.model.Employee;
@Repository
public interface employeeReository extends JpaRepository<Employee,Long> {
}