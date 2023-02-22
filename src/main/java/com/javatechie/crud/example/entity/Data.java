package com.javatechie.crud.example.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "userData")
public class Data {

    private String name;
    private String address;

    public Data(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
