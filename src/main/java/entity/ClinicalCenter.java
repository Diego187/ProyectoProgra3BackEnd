package entity;

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

    @Column(name = "phone")
    private String phone;

}
