package com.umg.ProyectoProgra3.service;

import com.umg.ProyectoProgra3.entity.User;
import com.umg.ProyectoProgra3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class CreateUserService {
    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/add")
    private void add(@RequestBody User user){
        userRepository.save(user);
    }

    @GetMapping(path = "/findAll")
    private List<User> find(){
        return userRepository.findAll();
    }
}
