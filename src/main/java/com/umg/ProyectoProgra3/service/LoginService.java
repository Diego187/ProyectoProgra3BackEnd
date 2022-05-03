package com.umg.ProyectoProgra3.service;


import com.umg.ProyectoProgra3.entity.Login;
import com.umg.ProyectoProgra3.entity.User;
import com.umg.ProyectoProgra3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginService {

    @Autowired
    UserRepository userRepository;

 //Servicio que devuelve un objeto del user si lo encuentra si es en blanco o null es porque no pasa la validacion
    @PostMapping(path = "/user")
    private List<User>  loginTeacher(@RequestBody Login credentials){
        return userRepository.findByUserAndPassword (credentials.getUser(), credentials.getPass());
    }








}
