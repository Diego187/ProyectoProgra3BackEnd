package com.umg.ProyectoProgra3.repository;


import com.umg.ProyectoProgra3.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("messageRepository")
public interface MessageRepository {
    public List<User> findByUserAndPassword(String user, String password);
}
