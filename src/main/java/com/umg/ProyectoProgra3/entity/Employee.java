package com.umg.ProyectoProgra3.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "idemployee")
    private Integer idemployee;

    public Integer getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(Integer idemployee) {
        this.idemployee = idemployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "rol")
    private String rol;

}
