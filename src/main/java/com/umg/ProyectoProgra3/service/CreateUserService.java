package com.umg.ProyectoProgra3.service;

import com.umg.ProyectoProgra3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class CreateUserService {
    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/add")
    private void add(){

    }

}
