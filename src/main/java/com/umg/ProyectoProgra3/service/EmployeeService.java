package com.umg.ProyectoProgra3.service;
import java.util.List;

import com.umg.ProyectoProgra3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ClinicalCenterRepository EmployeeRepository;

    @GetMapping(path = "/find")
    private List<Employee> find() {
        return employeeRepository.findAll();
    }

}
