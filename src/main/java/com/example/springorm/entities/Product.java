package com.example.springorm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jap_product")
public class Product {
    @Id
    private String pId;
    private String prodName;

    @ManyToMany
    List<Category> categoryList = new ArrayList<>();
    public Product() {
    }

    public Product(String pId, String prodName) {
        this.pId = pId;
        this.prodName = prodName;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
