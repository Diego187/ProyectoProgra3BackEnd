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
    private User add(@RequestBody User user){
        String newUser = newUser(user);
        user.setUser(newUser);
        userRepository.save(user);
        return user;
    }

    private String newUser(User user){
        List<User> userList = find();
        int cont = userList.size();
        cont = cont + 1;

        String first = String.valueOf(user.getFirstName().charAt(0));
        String newUser = first + user.getFirstLastName();
        newUser = newUser.toUpperCase();
        newUser = newUser + cont;
        return newUser;
    }

    @GetMapping(path = "/findAll")
    private List<User> find(){
        return userRepository.findAll();
    }

    @GetMapping(path = "/count")
    private int countUserBy() { return userRepository.countUserBy();}

    @PostMapping(path = "/modify")
    private User modify(@RequestBody User user){
        userRepository.save(user);
        return user;
    }

}
