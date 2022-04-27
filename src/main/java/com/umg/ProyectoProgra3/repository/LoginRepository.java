package com.umg.ProyectoProgra3.repository;

import com.umg.ProyectoProgra3.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("LoginRepository")
public interface LoginRepository extends JpaRepository<Login, Serializable> {

    public List<idUser> findByIduser (String idUser);

}
