package com.example.springorm.repositories;

import com.example.springorm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {

}
