package com.umg.ProyectoProgra3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.ProyectoProgra3.entity.User;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{

}
