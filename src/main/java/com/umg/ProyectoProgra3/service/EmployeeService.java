package com.umg.ProyectoProgra3.service;
import java.util.Optional;

import com.umg.ProyectoProgra3.entity.Employee;
import com.umg.ProyectoProgra3.repository.ClinicalCenterRepository;
import com.umg.ProyectoProgra3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ClinicalCenterRepository clinicalCenterRepository;



}
