package com.example.springorm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_laptops")
public class Laptop {
    @Id
    private int lapId;
    private String modelNo;
    private String brand;


}
