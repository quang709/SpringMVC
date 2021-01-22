package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name="misss")
public class Miss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private  int age;
    private  String email;
    private  String identityCard;
    private  String address;
    private String nativeplace;
    private Long ethnicityId;
    @ManyToOne
    @JoinColumn(name= "ethnicity_id")
    private Ethnicity ethnicity;
    public Miss(){
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public Long getEthnicityId() {
        return ethnicityId;
    }

    public void setEthnicityId(Long ethnicityId) {
        this.ethnicityId = ethnicityId;
    }

    public Ethnicity getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
    }
}