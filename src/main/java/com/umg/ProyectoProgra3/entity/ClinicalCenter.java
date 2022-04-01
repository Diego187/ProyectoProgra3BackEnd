package com.umg.ProyectoProgra3.entity;

import javax.persistence.*;

@Entity
@Table(name = "clinicalCenter")
public class ClinicalCenter {

    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "idclinicalCenter")
    private Integer idclinicalCenter;

    @Column(name = "address")
    private String address;

    public Integer getIdclinicalCenter() {
        return idclinicalCenter;
    }

    public void setIdclinicalCenter(Integer idclinicalCenter) {
        this.idclinicalCenter = idclinicalCenter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "phone")
    private String phone;

}
