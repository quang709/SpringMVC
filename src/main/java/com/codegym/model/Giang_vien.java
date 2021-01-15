package com.codegym.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="giang_viens")
public class Giang_vien {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String sdt;
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


    @OneToMany(targetEntity = Lop_hoc.class)
    private Set<Lop_hoc> lop_hocs;

    public Giang_vien() {
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

    public Set<Lop_hoc> getLop_hocs() {
        return lop_hocs;
    }

    public void setEmployees(Set<Lop_hoc> lop_hocs) {
        this.lop_hocs = lop_hocs;
    }
}
