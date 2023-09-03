package com.example.springorm.entities;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_address")
public class Address {
    @Id
    private int addressId;
    private String street;
    private String city;
    private String country;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    public Address(int addressId, String street, String city, String country) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Address() {
    }

    public int getAddressd() {
        return addressId;
    }

    public void setAddressd(int addressd) {
        this.addressId = addressd;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
