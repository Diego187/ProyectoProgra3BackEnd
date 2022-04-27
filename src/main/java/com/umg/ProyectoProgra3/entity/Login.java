package com.umg.ProyectoProgra3.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="user")
public class Login implements Serializable {

    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "iduser")
    private String user;

    @Column(name = "password")
    private String password;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
