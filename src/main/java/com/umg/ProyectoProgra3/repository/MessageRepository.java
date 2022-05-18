package com.umg.ProyectoProgra3.repository;


import com.umg.ProyectoProgra3.entity.Message;
import com.umg.ProyectoProgra3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("messageRepository")
public interface MessageRepository  extends JpaRepository<Message, Serializable> {

}