package com.example.jdbc_api_tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jdbc_api_tutorial.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
