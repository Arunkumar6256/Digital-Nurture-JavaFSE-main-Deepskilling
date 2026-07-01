package com.cognizant.orm_learn.handson4.repository;

import com.cognizant.orm_learn.handson4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}