package com.umg.ProyectoProgra3.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="client")
public class User implements Serializable {

    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "idclient")
    private String idclient;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "firstLastName")
    private String firstLastName;

    @Column(name = "secondLastName")
    private String secondLastName;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

}
