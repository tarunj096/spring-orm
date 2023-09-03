package com.example.springorm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_student")
public class Student {
    @Id
    private int studId;
    private String studName;
    private String about;
    @OneToOne
    private Laptop laptop;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();


    public Student(int studId, String studName, String about, Laptop laptop) {
        this.studId = studId;
        this.studName = studName;
        this.about = about;
        this.laptop = laptop;
    }

    public Student() {

    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
