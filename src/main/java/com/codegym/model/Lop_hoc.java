package com.codegym.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lop_hocs")
public class Lop_hoc{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String masv;
    private int age;
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }





    @ManyToOne
    @JoinColumn(name = "idLop_hoc")
    private Lop_hoc lop_hoc;

    public Lop_hoc getLop_hoc() {
        return lop_hoc;
    }

    public void setLop_hoc(Lop_hoc lop_hoc) {
        this.lop_hoc = lop_hoc;
    }

    public Lop_hoc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
