package com.umg.ProyectoProgra3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.ProyectoProgra3.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{
    public List<User> findByUserAndPassword(String user, String password);

    @Query(value = "select count(idclient) from user  ", nativeQuery = true)
    int countUserBy() ;

}


