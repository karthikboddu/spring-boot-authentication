package com.springapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapi.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}
