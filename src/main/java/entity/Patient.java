package entity;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
    private static final long serialVersionUID = 3760988163877761705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "idpatient")
    private Integer idpatient;

    @Column(name = "dpi")
    private Integer dpi;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

}
