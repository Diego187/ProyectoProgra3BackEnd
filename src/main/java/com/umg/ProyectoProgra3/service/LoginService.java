package com.umg.ProyectoProgra3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class LoginService {

    @Autowired
    UserRepository userRepository;


    @PostMapping(path = "/login")
    private Optional<User> loginTeacher(@RequestBody Login credentials){
        return userRepository.findByUserAndPassword (credentials.getUser(), credentials.getPass());
    }




}
