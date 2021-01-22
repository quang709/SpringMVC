package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "ethnicities")
public class Ethnicity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Set<Miss> getMisss() {
        return misss;
    }

    public void setMisss(Set<Miss> misss) {
        this.misss = misss;
    }

    @OneToMany(mappedBy = "ethnicity")
    private Set<Miss> misss;
    public  Ethnicity(){

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