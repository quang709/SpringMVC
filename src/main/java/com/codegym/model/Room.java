package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String number;
    private String ghe;
    private  String ban;
    private  String tivi;
    private  Long roomCategoryid;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGhe() {
        return ghe;
    }

    public void setGhe(String ghe) {
        this.ghe = ghe;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getTivi() {
        return tivi;
    }

    public void setTivi(String tivi) {
        this.tivi = tivi;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(RoomCategory roomCategory) {
        this.roomCategory = roomCategory;
    }



    public Long getRoomCategoryid() {
        return roomCategoryid;
    }

    public void setRoomCategoryid(Long roomCategoryid) {
        this.roomCategoryid = roomCategoryid;
    }


    @ManyToOne
    @JoinColumn(name= "roomCategory_id")
    private RoomCategory roomCategory;
    public Room(){}

}
