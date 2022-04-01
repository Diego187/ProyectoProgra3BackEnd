package com.umg.ProyectoProgra3.repository;

import com.umg.ProyectoProgra3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
}
