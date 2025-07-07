package com.michael.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michael.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
