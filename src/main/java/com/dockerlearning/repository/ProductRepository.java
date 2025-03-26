package com.dockerlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dockerlearning.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
