package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
 public List<Product> findBypName (String pName);
}
