package com.example.springorm.repositories;

import com.example.springorm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,String> {
    Product findByProductName(String productName);
    Product findByPId(int pId);

    List<Product> findByProductNameStartingWith(String prefix);
    List<Product> findByProductNameEndingWith(String suffix);

    //Query
    @Query(value = "SELECT p from Product p")
    List<Product> findAllProductWhileLearningJpa();
}
