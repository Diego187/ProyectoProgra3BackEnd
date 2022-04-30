package com.umg.ProyectoProgra3.service;

import com.umg.ProyectoProgra3.entity.User;
import com.umg.ProyectoProgra3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class CreateUserService {
    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/add")
    private List<User> add(@RequestBody User user){
        String newUser = newUser(user);
        user.setUser(newUser);
        return  userRepository.findAll();
    }

    private String newUser(User user){
        String newUser = "";
        List<User> userList = new ArrayList<>();
        userList = find();
        int cont = userList.size();
        cont = cont + 1;

        String first = String.valueOf(user.getFirstName().charAt(0));
        newUser = first + user.getFirstLastName();
        newUser = newUser.toUpperCase();
        newUser = newUser + cont;
        return newUser;
    }

    @GetMapping(path = "/findAll")
    private List<User> find(){
        return userRepository.findAll();
    }

}
