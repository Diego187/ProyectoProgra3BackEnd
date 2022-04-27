package com.umg.ProyectoProgra3.service;

<<<<<<< HEAD
import com.umg.ProyectoProgra3.entity.Login;
import com.umg.ProyectoProgra3.entity.User;
import com.umg.ProyectoProgra3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
>>>>>>> login

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginService {

    @Autowired
    UserRepository userRepository;


    @PostMapping(path = "/user")
    private List<User> loginTeacher(@RequestBody Login credentials){
        return userRepository.findByUserAndPassword (credentials.getUser(), credentials.getPass());
    }








}
