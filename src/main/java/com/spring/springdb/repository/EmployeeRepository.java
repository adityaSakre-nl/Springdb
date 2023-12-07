package com.spring.springdb.repository;

import com.spring.springdb.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
